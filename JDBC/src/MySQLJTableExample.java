import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MySQLJTableExample {
    private static final String URL = "jdbc:mysql://localhost:3306/sample"; // 데이터베이스 URL
    private static final String USER = "root"; // 사용자명
    private static final String PASSWORD = "1111"; // 비밀번호
    private static DefaultTableModel model; // JTable 모델을 클래스 필드로 변경

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MySQL JTable Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);

            // JTable 모델 생성
            model = new DefaultTableModel(new String[]{"ID", "Name", "Class"}, 0);
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane, BorderLayout.CENTER);

            // 버튼 패널 생성
            JPanel buttonPanel = new JPanel();
            JButton addButton = new JButton("추가");
            JButton deleteButton = new JButton("삭제");
            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            
            // 데이터베이스에서 데이터 불러오기
            loadData();

            // 추가 버튼 클릭 시 데이터베이스에 추가
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("이름을 입력하세요:");
                    String className = JOptionPane.showInputDialog("클래스를 입력하세요:");

                    if (name != null && className != null) {
                        try {
                            addStudentToDatabase(name, className); // 데이터베이스에 추가
                            loadData(); // JTable 업데이트
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(frame, "데이터베이스에 추가하는 데 실패했습니다.");
                        }
                    }
                }
            });

            // 삭제 버튼 클릭 시 선택된 행 삭제
            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        int id = (int) model.getValueAt(selectedRow, 0); // 선택된 행의 ID 가져오기

                        // 삭제 확인 다이얼로그
                        int confirm = JOptionPane.showConfirmDialog(frame, "삭제하시겠습니까?", "삭제 확인", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            try {
                                deleteStudentFromDatabase(id); // 데이터베이스에서 삭제
                                loadData(); // JTable 업데이트
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(frame, "데이터베이스에서 삭제하는 데 실패했습니다.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "삭제할 행을 선택하세요.");
                    }
                }
            });

            frame.setVisible(true);
        });
    }

    private static void loadData() {
        // JTable 모델 초기화
        model.setRowCount(0); // 기존 데이터 초기화
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM student")) {
             
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String className = resultSet.getString("class");
                model.addRow(new Object[]{id, name, className});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "데이터를 불러오는 데 실패했습니다.");
        }
    }

    private static void addStudentToDatabase(String name, String className) throws SQLException {
        String insertSQL = "INSERT INTO student (name, class) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
             
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, className);
            preparedStatement.executeUpdate();
        }
    }

    private static void deleteStudentFromDatabase(int id) throws SQLException {
        String deleteSQL = "DELETE FROM student WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
             
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }
}

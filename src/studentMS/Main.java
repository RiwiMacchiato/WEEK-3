package studentMS;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    static PersonRepo personRepo = new PersonRepo();

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton addStudent = new JButton("Agregar estudiante");
        JButton listStudents = new JButton("Listar estudiantes");
        JButton removeStudent = new JButton("Eliminar estudiante");
        JButton findStudent = new JButton("Encontrar estudiante por id");

        panel.add(addStudent);
        panel.add(listStudents);
        panel.add(removeStudent);
        panel.add(findStudent);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        addStudent.addActionListener(e -> {

            boolean passIdP = false;
            String idPString;
            int idPInt = 0;

            do {
                idPString = JOptionPane.showInputDialog(frame, "Ingrese el numero de documento del estudiante",
                        "Ventana",
                        JOptionPane.QUESTION_MESSAGE);

                if (idPString == null) {
                    return;
                }

                if (idPString.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Error, ingresa un numero de documento valido", "Adertencia",
                            JOptionPane.WARNING_MESSAGE);
                            continue;
                }

                try {
                    idPInt = Integer.parseInt(idPString);

                    if(idPInt < 0){
                        JOptionPane.showMessageDialog(frame, "Error, el numero tiene que ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(frame, "Error, el numero ingresado no es valido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                            continue;
                }

                Person findingStudent = personRepo.findById(idPInt);

                if(findingStudent == null){
                    passIdP = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "Error, el usuario con numero de documento #" + idPInt + " ya esta registrado","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            } while (!passIdP);

            boolean passName = false;
            String name;

            do {
                name = JOptionPane.showInputDialog(frame, "Ingrese el nombre del estudiante", "Ventana",
                        JOptionPane.QUESTION_MESSAGE);

                if (name == null) {
                    return;
                }

                if (name.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Error, ingresa un nombre valido", "Adertencia",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    passName = true;
                }

            } while (!passName);

            boolean passIdS = false;
            String idSString;
            int idSInt = 0;

            do {
                idSString = JOptionPane.showInputDialog(frame, "Ingrese el id del estudiante", "Ventana",
                        JOptionPane.QUESTION_MESSAGE);

                if (idSString == null) {
                    return;
                }

                if (idSString.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Error, ingresa un id de estudiante valido", "Adertencia",
                            JOptionPane.WARNING_MESSAGE);
                            continue;
                }

                try {
                    idSInt = Integer.parseInt(idSString);

                    if(idSInt < 0){
                        JOptionPane.showConfirmDialog(frame, "Error, el id del estudiante tiene que ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(frame, "Error, el numero ingresado no es valido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                boolean foundStudent = false;

                for(Person personS : personRepo.findAll()){
                    if(((Student) personS).getStudentId() == idSInt){
                        foundStudent = true;
                        break;
                    }
                }

                if(foundStudent){
                    JOptionPane.showMessageDialog(frame, "Error, el estudiante con id de estudiante #" + idSInt + " ya esta registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    passIdS = true;
                }

                

            } while (!passIdS);

            Student student = new Student(name, idPInt, idSInt);
            personRepo.save(student);

        });

        listStudents.addActionListener(a -> {

            if (personRepo.findAll().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No hay estudiantes registrados.", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Nombre");
            model.addColumn("# Documento");
            model.addColumn("Id de estudiante");

            for (int i = 0; i < personRepo.findAll().size(); i++) {
                String name = personRepo.findAll().get(i).getName();
                int documentNumber = personRepo.findAll().get(i).getId();
                int studentIdNumber = ((Student)personRepo.findAll().get(i)).getStudentId();

                model.addRow(new Object[] { name, documentNumber, studentIdNumber });
            }

            JTable table = new JTable(model);

            JScrollPane scroll = new JScrollPane(table);

            JOptionPane.showMessageDialog(frame, scroll);

        });

        removeStudent.addActionListener(b -> {

            if (personRepo.findAll().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No hay estudiantes registrados.", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

             boolean passIdP = false;
            String idPString;
            int idPInt = 0;

            do {
                idPString = JOptionPane.showInputDialog(frame, "Ingrese el numero de documento del estudiante que desea eliminar",
                        "Ventana",
                        JOptionPane.QUESTION_MESSAGE);

                if (idPString == null) {
                    return;
                }

                if (idPString.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Error, ingresa un numero de documento valido", "Adertencia",
                            JOptionPane.WARNING_MESSAGE);
                            continue;
                }

                try {
                    idPInt = Integer.parseInt(idPString);

                    if(idPInt < 0){
                        JOptionPane.showMessageDialog(frame, "Error, el numero tiene que ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(frame, "Error, el numero ingresado no es valido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                            continue;
                }

                Person findingStudent = personRepo.findById(idPInt);

                if(findingStudent != null){
                    personRepo.delete(idPInt);
                    JOptionPane.showMessageDialog(frame, "El estudiante con numero de documento #" + idPInt + " ha sido eliminado exitosamente.");
                    passIdP = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "Error, el usuario con numero de documento #" + idPInt + " no esta registrado","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            } while (!passIdP);

        });
        
        findStudent.addActionListener(c -> {

            if (personRepo.findAll().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No hay estudiantes registrados.", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

             boolean passIdP = false;
            String idPString;
            int idPInt = 0;

            do {
                idPString = JOptionPane.showInputDialog(frame, "Ingrese el numero de documento del estudiante que desea encontrar",
                        "Ventana",
                        JOptionPane.QUESTION_MESSAGE);

                if (idPString == null) {
                    return;
                }

                if (idPString.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Error, ingresa un numero de documento valido", "Adertencia",
                            JOptionPane.WARNING_MESSAGE);
                            continue;
                }

                try {
                    idPInt = Integer.parseInt(idPString);

                    if(idPInt < 0){
                        JOptionPane.showMessageDialog(frame, "Error, el numero tiene que ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(frame, "Error, el numero ingresado no es valido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                            continue;
                }

                Person findingStudent = personRepo.findById(idPInt);

                if(findingStudent != null){
                    JOptionPane.showMessageDialog(frame, "Estudiante encontrado: \n" + findingStudent.getDescription());
                    passIdP = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "Error, el usuario con numero de documento #" + idPInt + " no esta registrado","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            } while (!passIdP);

        });
    
    }

    public Integer readInteger(String message, String title, int typeOfMessage, JFrame frame) {
        boolean intPass = false;
        int number = 0;

        do {
            try {
                String intMessage = JOptionPane.showInputDialog(frame, message, title, typeOfMessage);

                if (intMessage == null) {
                    return null;
                }
                number = Integer.parseInt(intMessage);

                if (number < 0) {
                    JOptionPane.showMessageDialog(frame, "Solo puedes ingresar numeros positivos");
                } else {
                    intPass = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Haz ingresado un numero no valido", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!intPass);

        return number;
    }

    public Double readDouble(String message, String title, int typeOfMessage, JFrame frame) {
        boolean doublePass = false;
        double doubleNumber = 0;

        do {
            try {
                String doubleMessage = JOptionPane.showInputDialog(frame, message, title, typeOfMessage);

                if (doubleMessage == null) {
                    return null;
                }
                doubleNumber = Double.parseDouble(doubleMessage);

                if (doubleNumber < 0) {
                    JOptionPane.showMessageDialog(frame, "Solo puedes ingresar numeros positivos decimales.");
                } else {
                    doublePass = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Haz ingresado un numero decimal no valido", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!doublePass);

        return doubleNumber;
    }

}

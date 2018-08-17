
package estudiantes.pkg104;

import javax.swing.JOptionPane;

public class Estudiantes104 
{

    public static void main(String[] args){
        int estudiantes;
        int i;
        estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la catidad de estudiantes que decea ingresar"));
        int [] arreglo_edad = new int [estudiantes];
        int [] arreglo_peso = new int [estudiantes];
        double [] arreglo_telefono = new double [estudiantes];
        String[] arreglo_nombre = new String [estudiantes];
        String[] arreglo_nacionalidad = new String [estudiantes];
        String[] arreglo_color_pelo = new String [estudiantes];
        String[] arreglo_color_ojos = new String [estudiantes];
        String[] arreglo_color_piel = new String [estudiantes];
        String[] arreglo_sexo = new String [estudiantes];
        for(i=0;i<estudiantes;i++)
        {
            arreglo_nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            arreglo_edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
            arreglo_peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del estudiante"));
            arreglo_nacionalidad[i] = JOptionPane.showInputDialog("Ingrese la nacionalidad del estudiante");
            arreglo_sexo[i] = JOptionPane.showInputDialog("Ingrese el sexo del estudiante");
            arreglo_color_ojos[i] = JOptionPane.showInputDialog("Ingrese el color de ojos del estudiante");
            arreglo_color_pelo[i] = JOptionPane.showInputDialog("Ingrese el color de pelo del estudiante");
            arreglo_color_piel[i] = JOptionPane.showInputDialog("Igrese el color de piel del estudiante");
            arreglo_telefono[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el telefono del estudiante"));
        }
        for(i=1;i<=estudiantes;i++)
        {
            JOptionPane.showMessageDialog(null,"Los datos del estudiante "+i);
            JOptionPane.showMessageDialog(null,"Nombre "+arreglo_nombre[i]);
            JOptionPane.showMessageDialog(null,"Edad "+arreglo_edad[i]);
            JOptionPane.showMessageDialog(null,"Peso "+arreglo_peso[i]);
            JOptionPane.showMessageDialog(null,"Nacionalidad "+arreglo_nacionalidad[i]);
            JOptionPane.showMessageDialog(null,"Sexo "+arreglo_sexo[i]);
            JOptionPane.showMessageDialog(null,"Color de ojos "+arreglo_color_ojos[i]);
            JOptionPane.showMessageDialog(null,"Color de pelo "+arreglo_color_pelo[i]);
            JOptionPane.showMessageDialog(null,"Color de piel "+arreglo_color_piel[i]);
            JOptionPane.showMessageDialog(null,"Telefono "+arreglo_telefono[i]);
        }
        
    }
}

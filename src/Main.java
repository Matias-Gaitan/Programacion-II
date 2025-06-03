//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lucas", "Moreno", "33422", 20, "Brigadier San Martín 504", "+5493512239721");
        Estudiante persona2 = new Estudiante("Matías", "Gaitán", "27731", 20, "José Hernández 205", "+54935151236790", "89", "Desarrollo de software", 6.5);
        Profesor persona3 = new Profesor("Emiliano", "Medina", "37910", 33, "Avenida Colón 250", "+5493526920329", "Departamento de Historia", 500000, 6);
        EmpleadoAdministrativo persona4 = new EmpleadoAdministrativo("Julián", "Rodríguez", "45077", 29, "Calle Obispo Trejo 721", "+5493512904335", "Coordinador", "7hs-15hs", 550000);

        Persona[] personas = new Persona[]{persona1, persona2, persona3, persona4};

        for(int i=0;i<4;i++){
            personas[i].mostrarInformacion();
            System.out.println();
            switch (i){
                case 0:
                    persona1.saludar();
                    break;
                case 1:
                    persona2.estudiar();
                    break;
                case 2:
                    persona3.enseñar();
                    break;
                case 3:
                    persona4.administrar();
                    break;
            }
            System.out.println("-----------------------------------------");
        }





    }
}
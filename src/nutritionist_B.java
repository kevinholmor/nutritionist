public class nutritionist_B {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String[] recommendedFoods;

    public nutritionist_B(){

    }

    public String toString() {
        return "Nutriologo: " + name;
    }

    public nutritionist_B(String nombre, int edad, String sexo) {
        this.name = nombre;
        this.age = edad;
        this.gender = sexo;
    }

    public double calcularIMC() {
        double imc = weight / Math.pow(height, 2);
        return imc;
    }

    public void indicarPesoIdeal() {
        double imc = calcularIMC();
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("El paciente está en su peso ideal.");
        } else {
            System.out.println("El paciente no está en su peso ideal.");
        }
    }

    public void indicarSobrepeso() {
        double imc = calcularIMC();
        if (imc > 24.9) {
            System.out.println("El paciente tiene sobrepeso.");
        } else {
            System.out.println("El paciente no tiene sobrepeso.");
        }
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public int getEdad() {
        return age;
    }

    public void setEdad(int edad) {
        this.age = edad;
    }

    public String getSexo() {
        return gender;
    }

    public void setSexo(String sexo) {
        this.gender = sexo;
    }

    public double getPeso() {
        return weight;
    }

    public void setPeso(double peso) {
        this.weight = peso;
    }

    public double getAltura() {
        return height;
    }

    public void setAltura(double altura) {
        this.height = altura;
    }

    public String[] getAlimentosRecomendados() {
        return recommendedFoods;
    }

    public void setAlimentosRecomendados(String[] alimentosRecomendados) {
        this.recommendedFoods = alimentosRecomendados;
    }

}

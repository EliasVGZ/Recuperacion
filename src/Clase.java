class Clase {
    int i;
    String string = "string1";

    public Clase(int i, String string) {
        this.i = i;
        this.string = string;
    }

    public void modificaObjeto(int nuevo_int, String nuevo_string) {
        i = nuevo_int;
        string = nuevo_string;
    }

    @Override
    public String toString() {
        return "Objeto { i=" + i + ", a='" + string + "\'}";
    }
}

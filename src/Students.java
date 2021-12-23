public class Students extends Person{
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    public Students(){

    }

    public Students(int id, String name, int age, double diemToan, double diemLy, double diemHoa) {
        super(id, name, age);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getAvgPoint(){
        return (diemToan+diemLy+diemHoa)/3;
    }
}

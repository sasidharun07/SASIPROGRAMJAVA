package sasijava;

public class cabin_rental_rate {
private int cabin_no;
private double rentalrate;
public cabin_rental_rate(int cabin_no,double rentalrate)
{
	this.cabin_no = cabin_no;
	this.rentalrate = rentalrate;
}
public int getcabin_no()
{
	return this.cabin_no;
}
public void setcabin_no(int canin_no)
{
	this.cabin_no = cabin_no;
}
public double getrentalrate()
{
	return this.rentalrate;
}
public void setrentalrate(double rentalrate)
{
	this.rentalrate = rentalrate;
}
public double rent(int days)
{
	return days*this.rentalrate;
}
public String toString() {
	return "cabin_rental_rate[ cabin no: "+cabin_no+" , rentalrate = "+rentalrate+" ]";
}
	public static void main(String[] args) {
        cabin_rental_rate cabin1 = new cabin_rental_rate(101, 75.50);
        cabin_rental_rate cabin2 = new cabin_rental_rate(102, 100.00);

        // Display the cabin rental rates
        System.out.println(cabin1);
        System.out.println(cabin2);


	}

}

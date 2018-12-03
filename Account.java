package lab.Amikom;

public class Account {

		
		private static final int Rekening = 0;
		String nama;
		private double balance;
		int noRek;
		
		public Account(String nama, double balance, int noRek){
			this.nama = nama;
			this.balance = balance;
			this.noRek = noRek ;
		}
		public Account (String nama, int noRek){
			this.nama = nama;
			this.balance = 0.0;
			this.noRek = noRek;
		}
		public String getNama(){
			return this.nama;
		}
		public double getBalance(){
			return this.balance;
		}
		public double getRek(){
			return this.noRek;
		}
		public void tarik(double nominal){
			this.balance = this.balance - nominal;
		}
		public void tabung(double nominal){
			this.balance = this.balance + nominal;
		}
		

		
}

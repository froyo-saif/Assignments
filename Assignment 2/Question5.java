
class Tank{
	public void filled() {
		System.out.println("Tank is filled...");
	}
	public void emptied() {
		System.out.println("Tank is emptied!!!!!");
	}
	@Override
	protected void finalize() throws Throwable {

		emptied();
	}
}

public class Question5 {

	public static void main(String[] args) {
		Tank tank= new Tank();
		tank.filled();
		tank=null;
		System.gc();
	}

}

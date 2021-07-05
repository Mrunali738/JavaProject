package interfacePack;

public class Tyre implements Oveable, Rollable {
	int width;
	public boolean isMoveable() {
		return true;
	}
	public boolean isRollable() {
		return true;
	}

	public static void main(String[] args) {
   Tyre tt = new Tyre();
   System.out.println(tt.isMoveable());
   System.out.println(tt.isRollable());
	}

}

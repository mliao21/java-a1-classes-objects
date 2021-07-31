
/**
 * @MelissaLiao
 * 
 * To create scrabble tiles that assigns a letter and value for each tile.
 * Also to compare the letter and values between tiles.
 *
 */
public class Tile {
	
	private char letter = 'A';
	private int value = 1;
	
	/**
	 * @param l letter of the tile
	 * @param v value of the tile
	 */
	public Tile(char l, int v) {
		this.letter = l;
		this.value = v;
	}
	
	// to call in the tile letter and value from the constructor assigned in main
	@Override
	public String toString() {
		return this.letter + "[" + this.value + "]";
	}
	
	// method to compare letter and value between tiles
	@Override
	public boolean equals(Object obj) {
		// we need to have object in memory
		if (obj == null) {
			return false;
		}
		// we need a tile object to compare from
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Tile that = (Tile) obj;
		return this.letter == that.letter && this.value == that.value;
	}
	
	public static void main(String[] args) {
		
		Object o0 = new Tile('A',1);
		System.out.println("Tile 0: " + o0.toString());
		Object o1 = new Tile('A',1);
		System.out.println("Tile 1: " + o1.toString());
		Object o2 = new Tile('Z',10);
		System.out.println("Tile 2: " + o2.toString());
		
		//test out equality between tiles
		System.out.println("Tile 0 is equal to Tile 1 is " + o0.equals(o1));
		System.out.println("Tile 0 is equal to Tile 2 is " + o0.equals(o2));
	}

}

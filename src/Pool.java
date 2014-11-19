
public class Pool {
	public static void main(String[] args) {
		
	int hTiles = 1;
	int lTiles = 1;
	int hPool = 5;
	int lPool = 10;
	int pTiles = hTiles * lTiles;
	System.out.println("Povrsina Tiles " + pTiles) ;
	
	int pPool = hPool * lPool ;
	System.out.println("Povrsina pool " + pPool) ;
	
	int potrebnoTiles = pPool / pTiles ;
	System.out.println("potrebno je Tiles " + potrebnoTiles);
	
	
	}
	

	
	
}

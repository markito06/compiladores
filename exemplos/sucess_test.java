package compilers;


/*
 * Classe vazia	
 * */

class empty{
	
}

class types{
	 
	//int
	
	int int1 = 1;
	int int2 = -1;
	int int3 = 0;
	  
	//float
	float float1 = 1.;
	float float2 = .1;
	float float3 = 1.1E-5;
	float float4 = 1.1e-5;
	
	//boolean
	boolean b1 = true;
	boolean b2 = false;
	
	//char
	char c1 = 'd';
	char c2 = 'D';

	
	//string
	string constanteString = "equipe N - Guilherme e Marcos";

	// null
	string nula = null;
	
	//short
	short s1 = 1;
	
	//byte
	byte byte1 = 1;
	byte byte2 = 0;
	
	
	//long
	long l1 =11111111111111;
	long l2 =-11111111111111;
	

}

class operadores extends types{
	
	  //testa operadores booleanos
	  boolean equals = (1 == 2);
	  boolean greatOrEqual = (1 >= 2);
	  boolean loweOrEqual = (1 <= 2);
	  boolean great = (1 > 2);
	  boolean lower = (1 < 2);
	  boolean different = (1 != 2);
	  
	  
	  //testa operações
	  int sum = 1+1;
	  int  subtraction = 1-1;
	  double division = 2/1;
	  float division2 = 1/3;
	  int multiply = 2*2;
	  float modulus = 2%2;
  
}

class modifiers {
	
	final int;
	public int;
	private int;
	protected int;
	
	
}



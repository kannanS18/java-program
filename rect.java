class rect{
	int len;
	int width;
	void insert(int l,int wi){
		len=l;
		width=wi;
}
void calculatearea(){System.out.println(len*width);}
public static void main(String args[]){
	rect ar1=new rect();
	rect ar2=new rect();
	ar1.insert(4,5);
	ar2.insert(6,7);
	ar1.calculatearea();
	ar2.calculatearea();

}
}
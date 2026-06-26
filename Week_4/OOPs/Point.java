class point{
    private int x;
    private int y;

    public point(){
        x=0;
        y=0;
    }
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void display(){
        System.out.println("x:"+x+" y:"+y);
    }

    public static void main(String[] args) {
        point a=new point();
        a.display();

        point b=new point(10,20);
        b.display();

        b.setXY(10,20);
        b.display();
    }
}
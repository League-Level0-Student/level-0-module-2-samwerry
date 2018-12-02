int x = 0;

void setup() { 
  size(800,200);
}
void draw() {
  size(800,200);
    background(112,24,222);
    ellipse(x,100,100,100);

 if(mousePressed) {
   x=x+20;
 }



}
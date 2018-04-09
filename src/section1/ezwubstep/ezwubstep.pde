void setup() {
  size(800,800);
}
int loc = 400;
int x = 5;
  int y = 0;
void draw() {
  float ranLoc = random(800);
  float TranLoc = random(800);
  fill(x, x, -x);
  ellipse(loc,loc,x,x);
  ellipse(loc + 200,loc,x,x);
  ellipse(loc - 200,loc,x,x);
  ellipse(loc,loc + 200,x,x);
  ellipse(loc,loc - 200,x,x);
  ellipse(loc - 200,loc - 200,x,x);
  ellipse(loc + 200,loc + 200,x,x);
  ellipse(loc - 200,loc + 200,x,x);
  ellipse(loc + 200,loc - 200,x,x);
  if(mousePressed) {
    x=x+10;
    //ellipse(ranLoc, TranLoc, x, x);
  }
  else {
    x=x-10;
  }
  /*while(y<100) {
    x++;
  }
  y++;*/
}
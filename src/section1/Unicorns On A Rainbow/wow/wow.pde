PImage rainbow;
  PImage unicorn;
  void setup() {
    rainbow = loadImage("roy.png");
    size(800,600);
    rainbow.resize(width,height);
    background(rainbow);
    unicorn = loadImage("iphonex.png");
  }
  void draw() {
    background(rainbow);
    image(unicorn, mouseX/2, mouseY/2);
    
  }
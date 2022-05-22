import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class World1 extends Scrolling
{
    public World1(int act)
    {    
        super(600, 400, 1, 4000); // Construcctor para el scroll, (largo,ancho,1,tamaño del mundo)
        GreenfootImage bg = new GreenfootImage("backgroundScroll.jpg");
        //music=new GreenfootSound("World.mp3");
        //music.play();
        setScrollingBackground(bg);
        buildWorld(act);

    }
    
     public void buildWorld(int act)
    {
        addMainActor(new Baker(), 250, 300, 200,400);
        mainActor.setLocation(100, 250);
       // addObject(new Goal(act), 3950, 285);
    }
}


package Array;

public class Bola {
    //atribut
    public int radius;
    public double volume, phi=3.14;
    
    public Bola(){
        this.radius=6;
    }
    
    public void computeAndSetVolume(){
        double calculateVol=(this.phi*this.radius*this.radius*this.radius)*4/3;
        this.volume=calculateVol;
    }
    
    public double getVolume(){
        return volume;
    }
}

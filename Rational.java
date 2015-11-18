// Team Bash-ional -- Ling Cheng, William Xiang
// APCS Pd10
// HW32 -- Irrationality Stops Here
// 2015-11-17

public class Rational {
    private int _num, _den; //declare instance vars for numerator and denominator
    
    public Rational() {
        //set default number to 0/1
        _num = 0;
        _den = 1;
    }
    
    public Rational(int num, int den) {
        this(); //default constructor
        if (den == 0) { //denominator of 0 makes the number undefined
            //Error msg
            String s = "";
            s += "Invalid denominator";
            s += "\nNumber set to 0/1";
            System.out.println(s);
        } else {
            //set instance vars to ints given to constructor
            _num = num;
            _den = den;
        }
    }
    
    // ===== ACCESSOR METHODS =====
    public int getNum() {
        return _num;
    }
    
    public int getDen() {
        return _den;
    }
    // ============================    

    public String toString() {
        return _num + "/" + _den; //return "_num/_den" representation
    }
    
    public double floatValue() {
        return (double)_num / _den; //return the quotient of _num and _den as a double
    }
    
    public void multiply(Rational r) {
        //multiplies the numerator and denominators of this Rational object and the one given
        _num *= r.getNum();
        _den *= r.getDen();
    }
    
    public void divide(Rational r) {
        //multiplies the numerator and denominators of this Rational object to the reciprocal of the one given
        _num *= r.getDen();
        _den *= r.getNum();
    }
    
    public static void main(String[] args) {
        Rational r = new Rational(2,3); //Stores the rational number 2/3
        Rational s = new Rational(1,2); //Stores the rational number 1/2
        r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
        System.out.println(r+": should be 2/6");
        System.out.println(s+" : should be 1/2");
        r.divide(s); //Divides r by s, changes r to 4/6.  s remains 1/2
        System.out.println(r+": should be 4/6");
        System.out.println(s+" : should be 1/2");
        
        //r= 4/6 s=1/2
        s.multiply(r); //Multiplies s by r, changes s to 4/12.  r remains 4/6
        System.out.println(s+ " : should be 4/12");
        System.out.println(r+" : should be 4/6");
        s.divide(r); // Divides s by r, changes s to 24/248.  r remains 4/6
        System.out.println(s+" : should be 24/48");
        System.out.println(r+" : should be 4/6");
    }    
    
    
    
}
import java.util.Vector;

public class Rule {
    public String left;
    public Vector<String> right = new Vector<String>();

    Rule(){
        left = "";
        right = new Vector<String>();
    }

    public Rule(String left, Vector<String> right) {
        this.left = left;
        this.right = right;
    }

    Rule(String rule){
        String[] sp = rule.split(",");
        left = sp[0];
        for (int i = 1;i<sp.length;i++)
            right.add(sp[i]);
    }
    public void print(){
        System.out.println("Rule : ");
        System.out.print(left + " -> ");
        for (String s :right)
            System.out.print(s + " | ");
        System.out.println("\n__________________");
    }
    public void printString(){
        System.out.print(left);
        for (String s :right)
            System.out.print(","+s);
        System.out.print("; ");
    }
}

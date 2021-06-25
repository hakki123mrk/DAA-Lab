import java.util.Scanner;

public class exp6 {
    public static void main(String[]args) {
        int i, j, n;
        float temp, m;
        float p[] = new float[15];
        float w[] = new float[15];
        float c[] = new float[15];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of objects : ");
        n = s.nextInt();

        System.out.println("Enter weights and value : ");
        for( i = 1; i <= n; i++) {
            w[i] = s.nextFloat();
            p[i] = s.nextFloat();
        }

        System.out.print("Enter capacity of the Knapsack : ");
        m = s.nextInt();

        for( i = 1; i <=n ; i++)
            c[i] = p[i] / w[i];

        for( i = 1; i <= n; i++)
            for( j = i; j <= n-1; j++)
                if( c[j] < c[j+1]) {
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                    temp = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp;
                    temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
            	}

        System.out.println("The items to be arranged : ");
        System.out.println("Items \tWeights \tValue");
        for(i=1;i<=n;i++)
            System.out.println("x["+ i +"] \t" + w[i] +" \t" + p[i]);
        knapsack(n,m,w,p);
    }

    public static void knapsack(int n, float m, float w[], float p[]) {
	    float x[] = new float[15];
	    float u, profit = 0, weight = 0;
	    int i;
	    u = m;

    	for( i = 1; i <= n; i++)
            x[i] = 0;

        for( i = 1; i <= n; i++) {
		    if( w[i]    > u)
			    break;
		    x[i] = 1;
    		u = u - w[i];
	    }

        if( i <= n)
            x[i] = u / w[i];

        System.out.println("The solution vector is : ");
        for( i = 1; i <= n; i++) {
	        System.out.print( x[i] + "\t");
        }

        for( i = 1; i <=n; i++) {
	        w[i] = w[i] * x[i];
	        p[i] = p[i] * x[i];
        }

        for( i = 1; i <= n; i++) {
	        profit = profit + p[i];
        	weight = weight + w[i];
        }

        System.out.println("\nMaximum profit is : " + profit);
        System.out.println("Maximum weight is : " + weight);
    }
}
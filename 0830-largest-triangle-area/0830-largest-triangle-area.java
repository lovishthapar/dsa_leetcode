class Solution {
    public double largestTriangleArea(int[][] p)
     {
        int ro=p.length;
        if(ro==3)
        {
            return ar(p[0][0],p[0][1],p[1][0],p[1][1],p[2][0],p[2][1]);
        }
        double max=0;
        for(int i=0;i<ro;i++)
        {
              for(int f=0;f<ro;f++)
        {
              for(int g=0;g<ro;g++)
        {

            
             if(max<(ar(p[i][0],p[i][1],p[f][0],p[f][1],p[g][0],p[g][1])))
             max=ar(p[i][0],p[i][1],p[f][0],p[f][1],p[g][0],p[g][1]);

        }
            

        }

        }
         
               return max;        
    }
    public double ar(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        double area=0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area;
    }
}
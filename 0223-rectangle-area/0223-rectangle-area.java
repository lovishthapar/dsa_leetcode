class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) 
    {
        int l1=Math.abs(ax1-ax2);
        int b1=Math.abs(ay1-ay2);
        int l2=Math.abs(bx1-bx2);
        int b2=Math.abs(by1-by2);
        int ta=l1*b1+l2*b2;
        int cx1 = Math.max(ax1, bx1);
int cx2 =Math.min(ax2, bx2);
int cy1 = Math.max(ay1, by1);
int cy2 = Math.min(ay2, by2);

int oa = Math.max(0, cx2 - cx1) * Math.max(0, cy2 - cy1);
  
  return ta-oa;
        
    }
}
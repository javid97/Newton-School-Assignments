static int focal_length(int R, char Mirror){
   //Enter your code here
   if(Mirror == '(') return R / 2;
   else return (R % 2 == 0) ? -R/2 : -((R/2) + 1);
}
static class Student {
     // Enter your code here
     String name;
     int eng;
     int maths;
     int hindi;

     Student(String name, int eng, int maths, int hindi) {
          this.name = name;
          this.eng = eng;
          this.maths = maths;
          this.hindi = hindi;
     }

}

     static Student[] createStudentArray(int n) {
          // Enter your code here
          Student[] stud = new Student[n];
          for (int i = 0; i < n; i++) {
               String name = sc.next();
               int eng = sc.nextInt();
               int maths = sc.nextInt();
               int hindi = sc.nextInt();
               Student s = new Student(name, eng, maths, hindi);
               stud[i] = s;
          }
          return stud;
     }

     static int engAverage(Student st[], int n) {
          // Enter your code here
          int sum = 0;
          for (int i = 0; i < n; i++)
               sum += st[i].eng;
          return sum / n;
     }

static int avgPercentageOfClass(Student st[], int n){
    //Enter your code here
    int total = 0;
    for(int i = 0; i < n; i++) total += ((st[i].eng + st[i].maths + st[i].hindi) / 3);
    return total / n;
}
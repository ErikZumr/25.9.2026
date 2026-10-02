package org.example;

public class Penizky {
    static void main() {
        for(int m=0; m<10;m++){
            for( int o=0; o<10;o++){
                for( int n=0; n<10;n++){
                    for( int e=0; e<10;e++){
                        for( int y=0;y <10;y++){
                            for( int r=0; r<10;r++){
                                for( int s=0; s<10;s++){
                                    for( int d=0; d<10;d++){
                                        if (s*1000 + e*100 + n*10 + d + m*1000 + o*100 + r*10 + e
                                                == m*10000 +  o*1000 + n*100 + e*10 + y ){

                                            System.out.println(d);

                                        }

                                    }
                                }
                            }
                        }
                    }

                }
            }
        }






    }

}

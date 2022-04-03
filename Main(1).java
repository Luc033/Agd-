  import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {

    int mes;

    mes = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:" +
"\n 1 - janeiro" +
"\n 2 - fevereiro" +
"\n 3 - março" +                              
"\n 4 - abril" +
"\n 5 - maio" +
"\n 6 - junho" +
"\n 7 - julho" +
"\n 8 - agosto" +
"\n 9 - setembro" +
"\n 10 - outubro" +
"\n 11 - novembro" +
"\n 12 - dezembro"));
     
    if (mes == 1){
      JOptionPane.showMessageDialog(null, "Você escolheu janeiro");
    }else{
      if (mes == 2){
        JOptionPane.showMessageDialog(null, "Você escolheu fevereiro");
      }else{
        if (mes == 3){
          JOptionPane.showMessageDialog(null, "Você escolheu março");
        }else{
          if (mes == 4){
            JOptionPane.showMessageDialog(null, "Você escolheu abril");
          }else{
            if (mes == 5){
              JOptionPane.showMessageDialog(null, "Você escolheu maio");
            }else{
              if (mes == 6){
               JOptionPane.showMessageDialog(null, "Você escolheu junho");
              }else{
                if (mes == 7){
                  JOptionPane.showMessageDialog(null, "Você escolheu julho");
                }else{
                  if (mes == 8){
                    JOptionPane.showMessageDialog(null, "Você escolheu agosto");
                  }else{
                    if (mes == 9){
                      JOptionPane.showMessageDialog(null, "Você escolheu setembro");
                    }else{
                      if (mes == 10){
                        JOptionPane.showMessageDialog(null, "Você escolheu outubro");
                      }else{
                        if (mes == 11){
                          JOptionPane.showMessageDialog(null, "Você escolheu novembro");
                        }else{
                          if (mes == 12){
                            JOptionPane.showMessageDialog(null, "Você escolheu dezembro");
                          }else{
                            JOptionPane.showMessageDialog(null, "Valor inválido");
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
    }
        
    }
    
  }
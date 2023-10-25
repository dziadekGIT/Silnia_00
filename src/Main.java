import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Main extends JFrame
{

    public Main()
    {

        initComponents();

    }

    public void initComponents()
    {
        this.setTitle("Oblicz silnię");
        this.setBounds(300,300,300,300);

        this.getContentPane().add(panelWynik, BorderLayout.CENTER);
        panelWynik.add(oblicz);
        panelWynik.add(silnia);


        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);






        this.setDefaultCloseOperation(3);


        oblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            // obszarTekstowy.setText(null);

            String wartoscDoSilni =  silnia.getText();

            // for(int i = 0, i < liczba1, i++)



            try
                {
                    obszarTekstowy.setText(null);
                    int liczba1;
                    liczba1 = Integer.valueOf(wartoscDoSilni);
                    // obszarTekstowy.insert("Podałeś: " + wartoscDoSilni.toString(),0);

                    if(liczba1<0)
                    {
                        obszarTekstowy.setText(null);
                        obszarTekstowy.insert("   Błąd - podałeś liczbę mniejszą od 0.", 0);
                    }

                    long liczbaWynik = 1;




                        for(int i=1; i <= liczba1; i++)
                        {
                             liczbaWynik = liczbaWynik*i;


                        }


                        // System.out.println(liczbaWynik);

                        if (liczbaWynik <= 0) {
                            obszarTekstowy.insert("Podałeś błędną wartość, spróbuj mniejszą.", 0);
                        } else
                            obszarTekstowy.insert("Wynik: " + liczbaWynik, 0);

                }
            catch (NumberFormatException exception)
                {
                    obszarTekstowy.setText(null);
                    obszarTekstowy.insert("Podana wartość nie jest liczbą: " + wartoscDoSilni,0);

                }



            }
        });

    }

    private JTextArea obszarTekstowy = new JTextArea(7,10);
    private JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy);


    private JPanel panelWynik = new JPanel();
    private JButton oblicz = new JButton("Silnia");
    private JTextField silnia = new JTextField(4);








    public static void main(String[] args)
    {

        new Main().setVisible(true);

    }
}

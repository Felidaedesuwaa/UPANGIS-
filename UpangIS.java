import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class UpangIS extends JFrame {
    private JPanel mainPanel;
    private JPanel scholarshipPanel;
    private JPanel coursePanel;
    private JPanel cmaPanel;
    private JPanel celaPanel;
    private JPanel ccjePanel;
    private JPanel ceaPanel;
    private JPanel cahsPanel;
    private JPanel citPanel;
    private JPanel deanPanel; // New panel for Dean's Information
    private CardLayout cardLayout;

    private JFrame loginFrame;
    private JFrame adminFrame;
    private JFrame viewFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private List<Scholarship> scholarships;

    public UpangIS() {
        setTitle("UpangIS: Phinma UPang Information System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        JPanel contentPane = new JPanel(cardLayout);
        setContentPane(contentPane);
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBorder(new LineBorder(Color.RED));
        JLabel titleLabel = new JLabel("Welcome to the Phinma UPang Information System!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalGlue());
        scholarshipPanel = new JPanel();
        scholarshipPanel.setLayout(new BoxLayout(scholarshipPanel, BoxLayout.Y_AXIS));
        scholarshipPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(scholarshipPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        coursePanel = new JPanel();
        coursePanel.setLayout(new BoxLayout(coursePanel, BoxLayout.Y_AXIS));
        coursePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane courseScrollPane = new JScrollPane(coursePanel);
        courseScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton cmaButton = new JButton("College of Management and Accountancy");
        cmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cma");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(cmaButton);
        JButton celaButton = new JButton("College of Education and Liberal Arts");
        celaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cela");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(celaButton);
        JButton ccjeButton = new JButton("College of Criminal Justice Education");
        ccjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "ccje");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(ccjeButton);
        JButton ceaButton = new JButton("College of Engineering and Architecture");
        ceaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cea");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(ceaButton);
        JButton cahsButton = new JButton("College of Allied Health Sciences");
        cahsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cahs");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(cahsButton);
        JButton citButton = new JButton("College of Information Technology");
        citButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cit");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(citButton);
        JButton courseBackButton = new JButton("Back");
        courseBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "main");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(courseBackButton);
        contentPane.add(courseScrollPane, "course");
        cmaPanel = new JPanel();
        cmaPanel.setLayout(new BoxLayout(cmaPanel, BoxLayout.Y_AXIS));
        cmaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane cmaScrollPane = new JScrollPane(cmaPanel);
        cmaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton bsaButton = new JButton("Bachelor of Science in Accountancy");
        bsaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsaDetails = "Bachelor of Science in Accountancy\n\n" + "Provides students with the technical skills and knowledge in accounting, finance, management, and taxation, preparing them for careers in public accounting, private companies, government, and education.";
                JOptionPane.showMessageDialog(UpangIS.this, bsaDetails);
            }
        });
        cmaPanel.add(bsaButton);
        JButton bsmaButton = new JButton("Bachelor of Science in Management Accounting");
        bsmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsmaDetails = "Bachelor of Science in Management Accounting\n\n" + "Focuses on the application of accounting principles to provide financial information to managers for decision-making, planning, and control within an organization. It covers topics like cost accounting, budgeting, performance analysis, and strategic management accounting.";
                JOptionPane.showMessageDialog(UpangIS.this, bsmaDetails);
            }
        });
        cmaPanel.add(bsmaButton);
        JButton bsatButton = new JButton("Bachelor of Science in Accountancy Technology");
        bsatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsatDetails = "Bachelor of Science in Accountancy Technology\n\n" + "Combines accounting principles with information technology skills, preparing graduates to use accounting software and systems effectively. This program often includes topics like database management, enterprise resource planning (ERP) systems, and data analytics in accounting.";
                JOptionPane.showMessageDialog(UpangIS.this, bsatDetails);
            }
        });
        cmaPanel.add(bsatButton);
        JButton bshmButton = new JButton("Bachelor of Science in Hospitality Management");
        bshmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bshmDetails = "Bachelor of Science in Hospitality Management\n\n" + "Deals with the management and operations of hotels, restaurants, resorts, and other hospitality-related businesses. The curriculum includes topics such as food and beverage management, lodging operations, event planning, and tourism.";
                JOptionPane.showMessageDialog(UpangIS.this, bshmDetails);
            }
        });
        cmaPanel.add(bshmButton);
        JButton bstmButton = new JButton("Bachelor of Science in Tourism Management");
        bstmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bstmDetails = "Bachelor of Science in Tourism Management\n\n" + "Focuses on the planning, development, and management of tourist destinations and services. It covers areas like tourism marketing, destination management, travel operations, and cultural tourism.";
                JOptionPane.showMessageDialog(UpangIS.this, bstmDetails);
            }
        });
        cmaPanel.add(bstmButton);
        JButton bsbaButton = new JButton("Bachelor of Science in Business Administration");
        bsbaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaDetails = "Bachelor of Science in Business Administration\n\n" + "A broad program that covers various aspects of business management, including marketing, finance, human resources, and operations. Students can often choose a specialization within business administration.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaDetails);
            }
        });
        cmaPanel.add(bsbaButton);
        JButton bsbaMmButton = new JButton(
                "Bachelor of Science in Business Administration Major in Marketing Management");
        bsbaMmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaMmDetails = "Bachelor of Science in Business Administration Major in Marketing Management\n\n"
                        + "Specializes in the strategies and techniques used to promote and sell products or services. It includes topics like consumer behavior, market research, advertising, and branding.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaMmDetails);
            }
        });
        cmaPanel.add(bsbaMmButton);
        JButton bsbaFmButton = new JButton(
                "Bachelor of Science in Business Administration Major in Financial Management");
        bsbaFmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaFmDetails = "Bachelor of Science in Business Administration Major in Financial Management\n\n"
                        + "Focuses on the management of financial resources, including investment, funding, and risk management. It prepares students for careers in banking, corporate finance, and investment analysis.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaFmDetails);
            }
        });
        cmaPanel.add(bsbaFmButton);
        JButton cmaBackButton = new JButton("Back");
        cmaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        cmaPanel.add(cmaBackButton);
        contentPane.add(cmaScrollPane, "cma");
        celaPanel = new JPanel();
        celaPanel.setLayout(new BoxLayout(celaPanel, BoxLayout.Y_AXIS));
        celaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane celaScrollPane = new JScrollPane(celaPanel);
        celaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton abPolSciButton = new JButton("Bachelor of Arts in Political Science");
        abPolSciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String abPolSciDetails = "Bachelor of Arts in Political Science\n\n" + "Examines the theory and practice of politics and government. It covers topics such as political philosophy, comparative politics, international relations, and public administration.";
                JOptionPane.showMessageDialog(UpangIS.this, abPolSciDetails);
            }
        });
        celaPanel.add(abPolSciButton);
        JButton bEdButton = new JButton("Bachelor of Education");
        bEdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bEdDetails = "Bachelor of Education\n\n" + "A general education degree that may require further specialization to teach specific subjects or grade levels. It provides a foundation in educational theory and practice.";
                JOptionPane.showMessageDialog(UpangIS.this, bEdDetails);
            }
        });
        celaPanel.add(bEdButton);
        JButton bseeButton = new JButton("Bachelor of Science in Elementary Education");
        bseeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bseeDetails = "Bachelor of Science in Elementary Education\n\n" + "Prepares students to teach in elementary schools. It covers child development, teaching methodologies for various subjects, and classroom management.";
                JOptionPane.showMessageDialog(UpangIS.this, bseeDetails);
            }
        });
        celaPanel.add(bseeButton);
        JButton bsedButton = new JButton("Bachelor of Secondary Education");
        bsedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedDetails = "Bachelor of Secondary Education\n\n" + "Prepares students to teach in secondary schools, usually with a specialization in a particular subject area.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedDetails);
            }
        });
        celaPanel.add(bsedButton);
        JButton bsedEnglishButton = new JButton("Bachelor of Secondary Education Major in English");
        bsedEnglishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedEnglishDetails = "Bachelor of Secondary Education Major in English\n\n" + "Focuses on the study of English language and literature, preparing graduates to teach English in high schools.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedEnglishDetails);
            }
        });
        celaPanel.add(bsedEnglishButton);
        JButton bsedMathButton = new JButton("Bachelor of Secondary Education Major in Math");
        bsedMathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedMathDetails = "Bachelor of Secondary Education Major in Math\n\n" + "Focuses on mathematical concepts and teaching methodologies, preparing graduates to teach mathematics in high schools.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedMathDetails);
            }
        });
        celaPanel.add(bsedMathButton);
        JButton bsedScienceButton = new JButton("Bachelor of Secondary Education Major in Science");
        bsedScienceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedScienceDetails = "Bachelor of Secondary Education Major in Science\n\n" + "Covers various science disciplines and teaching strategies, preparing graduates to teach science in high schools.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedScienceDetails);
            }
        });
        celaPanel.add(bsedScienceButton);
        JButton bsedSocialStudiesButton = new JButton("Bachelor of Secondary Education Major in Social Studies");
        bsedSocialStudiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedSocialStudiesDetails = "Bachelor of Secondary Education Major in Social Studies\n\n" + "Integrates history, economics, geography, and other social sciences for teaching in high schools.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedSocialStudiesDetails);
            }
        });
        celaPanel.add(bsedSocialStudiesButton);
        JButton celaBackButton = new JButton("Back");
        celaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        celaPanel.add(celaBackButton);
        contentPane.add(celaScrollPane, "cela");
        ccjePanel = new JPanel();
        ccjePanel.setLayout(new BoxLayout(ccjePanel, BoxLayout.Y_AXIS));
        ccjePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane ccjeScrollPane = new JScrollPane(ccjePanel);
        ccjeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton bsCrimButton = new JButton("Bachelor of Science in Criminology");
        bsCrimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCrimDetails = "Bachelor of Science in Criminology\n\n" + "Focuses on the study of crime and the criminal justice system. It includes topics like criminal behavior, law enforcement, criminal law, and forensic science.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCrimDetails);
            }
        });
        ccjePanel.add(bsCrimButton);
        JButton ccjeBackButton = new JButton("Back");
        ccjeBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        }); ccjePanel.add(ccjeBackButton);
        contentPane.add(ccjeScrollPane, "ccje");
        ceaPanel = new JPanel();
        ceaPanel.setLayout(new BoxLayout(ceaPanel, BoxLayout.Y_AXIS));
        ceaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane ceaScrollPane = new JScrollPane(ceaPanel);
        ceaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton bsArchButton = new JButton("Bachelor of Science in Architecture");
        bsArchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsArchDetails = "Bachelor of Science in Architecture\n\n" + "Focuses on the design and planning of buildings and other physical structures. It includes aspects of aesthetics, functionality, and safety.";
                JOptionPane.showMessageDialog(UpangIS.this, bsArchDetails);
            }
        });
        ceaPanel.add(bsArchButton);
        JButton bsCompEngButton = new JButton("Bachelor of Science in Computer Engineering");
        bsCompEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCompEngDetails = "Bachelor of Science in Computer Engineering\n\n" + "Combines electrical engineering and computer science to design and develop computer systems and related technologies.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCompEngDetails);
            }
        });
        ceaPanel.add(bsCompEngButton);
        JButton bsCivEngButton = new JButton("Bachelor of Science in Civil Engineering");
        bsCivEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCivEngDetails = "Bachelor of Science in Civil Engineering\n\n" + "Deals with the design, construction, and maintenance of the physical and naturally built environment, including public works such as roads, bridges, canals, dams, and buildings.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCivEngDetails);
            }
        });
        ceaPanel.add(bsCivEngButton);
        JButton bsElecEngButton = new JButton("Bachelor of Science in Electrical Engineering");
        bsElecEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsElecEngDetails = "Bachelor of Science in Electrical Engineering\n\n" + "Focuses on the design, development, and testing of electrical equipment and systems.";
                JOptionPane.showMessageDialog(UpangIS.this, bsElecEngDetails);
            }
        });
        ceaPanel.add(bsElecEngButton);
        JButton bsMechEngButton = new JButton("Bachelor of Science in Mechanical Engineering");
        bsMechEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsMechEngDetails = "Bachelor of Science in Mechanical Engineering\n\n" + "Involves the design, development, and manufacturing of mechanical systems and devices.";
                JOptionPane.showMessageDialog(UpangIS.this, bsMechEngDetails);
            }
        });
        ceaPanel.add(bsMechEngButton);
        JButton ceaBackButton = new JButton("Back");
        ceaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        ceaPanel.add(ceaBackButton);
        contentPane.add(ceaScrollPane, "cea");
        cahsPanel = new JPanel();
        cahsPanel.setLayout(new BoxLayout(cahsPanel, BoxLayout.Y_AXIS));
        cahsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane cahsScrollPane = new JScrollPane(cahsPanel);
        cahsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton bsNursingButton = new JButton("Bachelor of Science in Nursing");
        bsNursingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsNursingDetails = "Bachelor of Science in Nursing\n\n" + "Prepares students for careers as registered nurses, involving patient care, health education, and medical administration.";
                JOptionPane.showMessageDialog(UpangIS.this, bsNursingDetails);
            }
        });
        cahsPanel.add(bsNursingButton);
        JButton bsPharmacyButton = new JButton("Bachelor of Science in Pharmacy");
        bsPharmacyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsPharmacyDetails = "Bachelor of Science in Pharmacy\n\n" + "Focuses on the science and practice of dispensing and preparing medications, as well as pharmaceutical care.";
                JOptionPane.showMessageDialog(UpangIS.this, bsPharmacyDetails);
            }
        });
        cahsPanel.add(bsPharmacyButton);
        JButton bmlsButton = new JButton("Bachelor in Medical Laboratory Science");
        bmlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bmlsDetails = "Bachelor in Medical Laboratory Science\n\n" + "Trains students to perform laboratory tests that help in the diagnosis and treatment of diseases.";
                JOptionPane.showMessageDialog(UpangIS.this, bmlsDetails);
            }
        });
        cahsPanel.add(bmlsButton);
        JButton bsPsychologyButton = new JButton("Bachelor of Science in Psychology");
        bsPsychologyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsPsychologyDetails = "Bachelor of Science in Psychology\n\n" + "Studies the human mind and behavior, covering areas like cognitive processes, social behavior, and abnormal psychology.";
                JOptionPane.showMessageDialog(UpangIS.this, bsPsychologyDetails);
            }
        });
        cahsPanel.add(bsPsychologyButton);
        JButton cahsBackButton = new JButton("Back");
        cahsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        cahsPanel.add(cahsBackButton);
        contentPane.add(cahsScrollPane, "cahs");
        citPanel = new JPanel();
        citPanel.setLayout(new BoxLayout(citPanel, BoxLayout.Y_AXIS));
        citPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane citScrollPane = new JScrollPane(citPanel);
        citScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JButton bsItButton = new JButton("Bachelor of Science in Information Technology");
        bsItButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsItDetails = "Bachelor of Science in Information Technology\n\n" + "Focuses on the application of computers and technology to solve problems and manage information systems.";
                JOptionPane.showMessageDialog(UpangIS.this, bsItDetails);
            }
        });
        citPanel.add(bsItButton);
        JButton citBackButton = new JButton("Back");
        citBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        citPanel.add(citBackButton);
        contentPane.add(citScrollPane, "cit");
        deanPanel = new JPanel();
        deanPanel.setLayout(new FlowLayout());
        deanPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel deanLabel = new JLabel("Dean's Information Coming Soon!");
        deanLabel.setFont(new Font("Arial", Font.BOLD, 16));
        deanPanel.add(deanLabel);
        JButton deanBackButton = new JButton("Back");
        deanBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "main");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        deanPanel.add(deanBackButton);
        contentPane.add(deanPanel, "dean");
        JButton phinmaScholarshipButton = new JButton("1. PHINMA Scholarship (formerly Presidential Scholarship)");
        phinmaScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String scholarshipDetails = "Benefits:\n" + "100% discount on tuition & miscellaneous fees for 4 or 5 years\n" + "on academic performance and leadership potential.";
                JOptionPane.showMessageDialog(UpangIS.this, scholarshipDetails);
            }
        });
        scholarshipPanel.add(phinmaScholarshipButton);
        JButton studentAssistanceButton = new JButton("2. Student Assistance Scholarship");
        studentAssistanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String assistanceDetails = "Benefits:\n" + "100% off the tuition (21 units only)\n\n" + "Given to students with financial needs and good academic standing.";
                JOptionPane.showMessageDialog(UpangIS.this, assistanceDetails);
            }
        });
        scholarshipPanel.add(studentAssistanceButton);
        JButton valSalButton = new JButton("3. Valedictorian & Salutatorian Scholarship");
        valSalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valSalDetails = "Benefits:\n" + "Full tuition fee discount for Valedictorian and partial for Salutatorian\n" + "Granted to high school graduates who were class valedictorian or salutatorian.";
                JOptionPane.showMessageDialog(UpangIS.this, valSalDetails);
            }
        });
        scholarshipPanel.add(valSalButton);
        JButton deanListButton = new JButton("4. Dean's List Scholarship");
        deanListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deanListDetails = "Benefits:\n" + "100% coverage of tuition fees for the top 10 students in the Dean's List each semester\n" + "Awarded to students who achieve a certain GPA and are in the top of their college's Dean's List.";
                JOptionPane.showMessageDialog(UpangIS.this, deanListDetails);
            }
        });
        scholarshipPanel.add(deanListButton);
        JButton highestHonorButton = new JButton("5. With Highest Honor");
        highestHonorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String highestHonorDetails = "Benefits:\n" + "100% off the tuition for the semester upon entry only.\n\n" + "Given to students who graduated high school with the highest honors.";
                JOptionPane.showMessageDialog(UpangIS.this, highestHonorDetails);
            }
        });
        scholarshipPanel.add(highestHonorButton);
        JButton dependentScholarshipButton = new JButton("6. PHINMA UPang Direct Dependent Scholarship");
        dependentScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dependentDetails = "Benefits:\n" + "100% (with duty) or 50% off the tuition fee\n\n" + "For children or dependents of PHINMA UPang employees.";
                JOptionPane.showMessageDialog(UpangIS.this, dependentDetails);
            }
        });
        scholarshipPanel.add(dependentScholarshipButton);
        JButton hawakKamayButton = new JButton("7. Hawak Kamay Scholarship");
        hawakKamayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hawakKamayDetails = "Benefits:\n" + "HK5.5 (₱5,500 per semester)\n" + "Granted to students who meet certain criteria related to financial need and academic performance.";
                JOptionPane.showMessageDialog(UpangIS.this, hawakKamayDetails);
            }
        });
        scholarshipPanel.add(hawakKamayButton);
        JButton victoryLinerButton = new JButton(
                "8. Victory Liner, 5-Star, and Transasia Oil Employee & Direct Dependent Scholarship");
        victoryLinerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String victoryLinerDetails = "Benefits:\n" + "25% off the tuition fee\n" + "For employees and their direct dependents of Victory Liner, 5-Star, and Transasia Oil.";
                JOptionPane.showMessageDialog(UpangIS.this, victoryLinerDetails);
            }
        });
        scholarshipPanel.add(victoryLinerButton);
        JButton medicalCityButton = new JButton("9. The Medical City Employee & Direct Dependent Scholarship");
        medicalCityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicalCityDetails = "Benefits:\n" + "50% off the tuition fees\n" + "For employees and their direct dependents of The Medical City.";
                JOptionPane.showMessageDialog(UpangIS.this, medicalCityDetails);
            }
        });
        scholarshipPanel.add(medicalCityButton);
        JButton kapamilyaButton = new JButton("10. Kapamilya @ PHINMA UPang Scholarship");
        kapamilyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kapamilyaDetails = "Benefits:\n" + "Discount for multiple family members enrolled in PHINMA UPang simultaneously.\n" + "Specific discount rates vary.";
                JOptionPane.showMessageDialog(UpangIS.this, kapamilyaDetails);
            }
        });
        scholarshipPanel.add(kapamilyaButton);
        JButton alumniButton = new JButton("11. PHINMA UPang Alumni Scholarship");
        alumniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alumniDetails = "Benefits:\n" + "Discount for PHINMA UPang alumni pursuing further studies at the institution.\n" + "Specific discount rates vary.";
                JOptionPane.showMessageDialog(UpangIS.this, alumniDetails);
            }
        });
        scholarshipPanel.add(alumniButton);
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "main");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        scholarshipPanel.add(backButton);
        contentPane.add(scrollPane, "scholarship");
        JButton scholarshipButton = new JButton("Scholarship");
        JButton courseButton = new JButton("Course");
        JButton deanButton = new JButton("Dean's Information"); // New button
        scholarshipButton.setFont(new Font("Arial", Font.BOLD, 18));
        courseButton.setFont(new Font("Arial", Font.BOLD, 18));
        deanButton.setFont(new Font("Arial", Font.BOLD, 15));
        scholarshipButton.setPreferredSize(new Dimension(200, 50));
        courseButton.setPreferredSize(new Dimension(200, 50));
        deanButton.setPreferredSize(new Dimension(200, 50));
        scholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "scholarship");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        courseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        deanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "dean");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        JButton adminLoginButton = new JButton("Admin Login");
        adminLoginButton.setFont(new Font("Arial", Font.BOLD, 18));
        adminLoginButton.setPreferredSize(new Dimension(200, 50));
        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createLoginGUI();
            }
        });
        mainPanel.add(scholarshipButton);
        mainPanel.add(courseButton);
        mainPanel.add(deanButton); // Add the new button
        mainPanel.add(adminLoginButton);
        contentPane.add(mainPanel, "main");

        // Show the main panel initially
        cardLayout.show(contentPane, "main");

        setVisible(true);
        scholarships = new ArrayList<>();
    } public void createLoginGUI() {
        loginFrame = new JFrame("Admin Login");
        loginFrame.setSize(600, 400);
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setLayout(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                    loginFrame.dispose();
                    createAdminGUI();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid credentials");
                }
            }
        });
        loginFrame.add(usernameLabel);
        loginFrame.add(usernameField);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.setVisible(true);
    }

    public void createAdminGUI() {
        adminFrame = new JFrame("Admin Panel");
        adminFrame.setSize(600, 400);
        adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminFrame.setLayout(new GridLayout(3, 1));
        JButton addScholarshipButton = new JButton("Add Scholarship");
        JButton viewScholarshipsButton = new JButton("View Scholarships");
        JButton logoutButton = new JButton("Logout");
        addScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAddScholarshipGUI();
            }
        });
        viewScholarshipsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createViewScholarshipsGUI();
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminFrame.dispose();
                createLoginGUI();
            }
        });
        adminFrame.add(addScholarshipButton);
        adminFrame.add(viewScholarshipsButton);
        adminFrame.add(logoutButton);
        adminFrame.setVisible(true);
    }

    public void createAddScholarshipGUI() {
        JFrame addFrame = new JFrame("Add Scholarship");
        addFrame.setSize(600, 600);
        addFrame.setLayout(new GridLayout(5, 2));
        JTextField nameField = new JTextField();
        JTextField scholarshipField = new JTextField();
        JTextField deadlineField = new JTextField();
        addFrame.add(new JLabel("Name:"));
        addFrame.add(nameField);
        addFrame.add(new JLabel("Scholarship:"));
        addFrame.add(scholarshipField);
        addFrame.add(new JLabel("Deadline:"));
        addFrame.add(deadlineField);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String scholarship = scholarshipField.getText();
                String deadline = deadlineField.getText();
                scholarships.add(new Scholarship(name, scholarship, deadline));
                JOptionPane.showMessageDialog(addFrame, "Scholarship added successfully");
                addFrame.dispose();
            }
        });
        addFrame.add(addButton);
        addFrame.setVisible(true);
    }

    public void createViewScholarshipsGUI() {
        viewFrame = new JFrame("View Scholarships");
        viewFrame.setSize(600, 600);
        viewFrame.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        for (Scholarship scholarship : scholarships) {
            textArea.append(scholarship.toString() + "\n\n");
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        viewFrame.add(scrollPane, BorderLayout.CENTER);
        viewFrame.setVisible(true);
    }

    static class Scholarship {
        String name;
        String scholarship;
        String deadline;

        public Scholarship(String name, String scholarship, String deadline) {
            this.name = name;
            this.scholarship = scholarship;
            this.deadline = deadline;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\nScholarship: " + scholarship + "\nDeadline: " + deadline;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UpangIS());
    }
}
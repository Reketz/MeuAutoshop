/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systech.util;

import br.com.systech.bean.Veiculo;
import br.com.systech.util.Biblioteca;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Ativador {

    public static void main(String[] args) {
//        System.out.println("\n******* GET *******\n");
//        createDAOGet(Veiculo.class);
//        System.out.println("\n******* SET *******\n");
//        createDAOSet(Veiculo.class, Arrays.asList("codigo"));
        String key = "RDREMkQ2NUFFNTIx";
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, +1);

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        System.out.println(sdf.format(c.getTime()).substring(4, 8) + Biblioteca.encode(key) + sdf.format(c.getTime()).substring(0, 4));
         
    }

    public static void createDAOSet(Class classe, List params) {
        String classeName = classe.getSimpleName();
        String classeSimpleName = classe.getSimpleName().toLowerCase();
        Field[] declaredMethods = classe.getDeclaredFields();

        System.out.println("try{\n"
                + classeName + " " + classeSimpleName + " = new " + classeName + "();\n"
                + "this.conexao = ConexaoBanco.conexao();\n"
                + "ResultSet rs;\n"
                + "String sql = \"\";\n\n"
                + "this.statment = conexao.prepareStatement(sql);\n"
                + "");

        for (int i = 0; i < params.size(); i++) {
            System.out.println("this.statment.setString(" + (i + 1) + ", " + params.get(i) + ");");
        }

        System.out.println("rs = this.statment.executeQuery();\n"
                + "if (rs.next()) {\n");

        for (int i = 1; i <= declaredMethods.length; i++) {
            Field m = declaredMethods[i - 1];
            String name = m.getName();
            String type = m.getType().toString();
            if (type.contains("java.lang.String")) {
                System.out.println(classeSimpleName + ".set" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "(rs.getString(\""+m.getName().toUpperCase()+"\"));");
            } else if (type.contains("int")) {
                System.out.println(classeSimpleName + ".set" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "(rs.getInt(\""+m.getName().toUpperCase()+"\"));");
            } else if (type.contains("java.math.BigDecimal")) {
                System.out.println(classeSimpleName + ".set" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "(rs.getBigDecimal(\""+m.getName().toUpperCase()+"\"));");
            }
        }

        System.out.println("\nreturn "+classeSimpleName+";\n}\n"
                + "} catch (ClassNotFoundException | SQLException ex) {\n"
                + "JOptionPane.showMessageDialog(null, \"Erro (1) ao Inserir:\\n\" + ex, \"Erro\", JOptionPane.ERROR_MESSAGE);\n"
                + "} finally {\n"
                + "try {\n"
                + "this.conexao.close();\n"
                + "this.statment.close();\n"
                + "} catch (SQLException ex) {\n"
                + "JOptionPane.showMessageDialog(null, \"Erro (2) ao Inserir:\\n\" + ex);\n"
                + "}\n"
                + "\n"
                + "}\n"
                + "return null;\n\n");
    }

    public static void createDAOGet(Class classe) {
        String classeName = classe.getSimpleName().toLowerCase();
        Field[] declaredMethods = classe.getDeclaredFields();

        System.out.println("try{\n"
                + "this.conexao = ConexaoBanco.conexao();\n"
                + "String sql = \"\";\n\n"
                + "this.statment = conexao.prepareStatement(sql);\n"
                + "");

        for (int i = 1; i <= declaredMethods.length; i++) {
            Field m = declaredMethods[i - 1];
            String name = m.getName();
            String type = m.getType().toString();
            if (type.contains("java.lang.String")) {
                System.out.println("this.statment.setString(" + i + ", " + classeName + ".get" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "());");
            } else if (type.contains("int")) {
                System.out.println("this.statment.setInt(" + i + ", " + classeName + ".get" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "());");
            } else if (type.contains("java.math.BigDecimal")) {
                System.out.println("this.statment.setBigDecimal(" + i + ", " + classeName + ".get" + Character.toUpperCase(m.getName().charAt(0)) + name.substring(1) + "());");
            }
        }

        System.out.println("\nthis.statment.executeUpdate();\n"
                + "return true;\n"
                + "} catch (ClassNotFoundException | SQLException ex) {\n"
                + "JOptionPane.showMessageDialog(null, \"Erro (1) ao Inserir:\\n\" + ex, \"Erro\", JOptionPane.ERROR_MESSAGE);\n"
                + "} finally {\n"
                + "try {\n"
                + "this.conexao.close();\n"
                + "this.statment.close();\n"
                + "} catch (SQLException ex) {\n"
                + "JOptionPane.showMessageDialog(null, \"Erro (2) ao Inserir:\\n\" + ex);\n"
                + "}\n"
                + "\n"
                + "}\n"
                + "return false;\n\n");
    }

}

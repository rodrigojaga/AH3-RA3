package MODELO;

import DAO.evaltiDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class evaltiDAORelacional implements evaltiDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();

     @Override
    public LinkedList<evalti> listar() {
        String sql = "SELECT usuarios.id_usuario, usuarios.nombre, usuarios.apellido, roles.nombre_rol, usuarios.correo_electronico, usuarios.telefono FROM usuarios INNER JOIN roles ON usuarios.rol_id = roles.rol_id";
        LinkedList<evalti> listar = new LinkedList<>();
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listar.add(new evalti(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6)));
            }
            return listar;
        } catch (Exception e) {
        }
        return null;
    }
    
    @Override
    public evalti obtener(int codigo) {
        String sql = "select * from usuarios where id_usuario= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                evalti eve = new evalti(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),rs.getString(6),
                rs.getString(7),rs.getInt(8),rs.getBoolean(9),rs.getString(10));
                return eve;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Resultados");
            }
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void crear(evalti eva) {
        String sql = "insert into usuarios(nombre,apellido,telefono,direccion,correo_electronico,fecha_nacimiento,rol_id,activo,contrasena) values (?,?,?,?,?,?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, eva.getNombre());
            ps.setString(2, eva.getApellido());
            ps.setInt(3, eva.getTelefono());
            ps.setString(4, eva.getDireccion());
            ps.setString(5, eva.getCorreo_electronico());
            ps.setString(6, eva.getFecha_nacimiento());
            ps.setInt(7, eva.getRol_id());
            ps.setBoolean(8, eva.isActivo());
            ps.setString(9, eva.getContrasena());
            ps.executeUpdate();
        }catch(Exception e){}
    }

    @Override
    public void modificar(evalti eva) {
        String sql = "update usuarios set nombre=?, apellido=?, telefono=?,direccion = ?, correo_electronico = ?, fecha_nacimiento =?,activo =?,contrasena = ? where id_usuario=?;";
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, eva.getNombre());
            ps.setString(2, eva.getApellido());
            ps.setInt(3, eva.getTelefono());
            ps.setString(4, eva.getDireccion());
            ps.setString(5, eva.getCorreo_electronico());
            ps.setString(6, eva.getFecha_nacimiento());
            ps.setBoolean(7, eva.isActivo());
            ps.setString(8, eva.getContrasena());
            ps.setInt(9, eva.getId_usuario());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }

   @Override
    public LinkedList<evalti> compararLogin() {
        String sql = "SELECT correo_electronico,contrasena,nombre,apellido,activo from usuarios WHERE rol_id = 1;";
        LinkedList<evalti> compararC = new LinkedList<>();
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                compararC.add(new evalti(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5)));
            }
            return compararC;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
        
    }


    @Override
    public LinkedList<evalti> gerente() {
        String sql = "SELECT correo_electronico,contrasena,nombre,apellido,activo from usuarios WHERE rol_id = 2;";
        LinkedList<evalti> compararC = new LinkedList<>();
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                compararC.add(new evalti(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5)));
            }
            return compararC;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

   
    
}

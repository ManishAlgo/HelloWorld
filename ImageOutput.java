res.setContentType("Image/jpg");
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "";
        Connection con = null;
        Statement st = null;
        Blob image = null;
        byte [] imgData = null;
        int id = Integer.parseInt(req.getParameter("id"));
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            String query = "select image from student_info where student_id="+id;
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                image = rs.getBlob("image");
                imgData = image.getBytes(1, (int)image.length());
            }
            else
            {
                System.out.println("image not found");
            }
            
            OutputStream o = res.getOutputStream();
            o.write(imgData);
            o.flush();
            o.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
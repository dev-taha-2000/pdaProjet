package com.pdaProjet.Controller;

import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Entitys.Etat;
import com.pdaProjet.Service.ActiviteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addactivite", value = "/addActivite")
public class ActiviteServlet extends HttpServlet {
    /*private String validate=null;*/
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.getServletContext().getRequestDispatcher("/WEB-INF/addActivite.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
        String titre=req.getParameter("titre");
        String description = req.getParameter("description");
        String date_debut = req.getParameter("date_debut");
        String date_fin = req.getParameter("date_fin");

        Activite activite = new Activite();
        Etat etat = new Etat();
        etat.setId(1);
        activite.setEtat( etat);
        activite.setDate_debut("12-11-2020");
        activite.setDate_defin("12-11-2020");
        activite.setTitre("khalil");
        activite.setDescription("khalil omaygaad");
        // fill objet activite
        new ActiviteService().addActivite(activite);

























      /*  out.println(titre);
        out.println(description);*/
       /* if(titre.equals("") && description.equals("") && date_debut.equals("") && date_debut.equals("") && date_fin.equals("") && participant.equals("")){
            doGet(req, resp);
        }*/
        /*   else {*/
      /*  Etat etat1= new Etat();
        etat1.setId(1);
        etat1.setEtat("active");*/

      /*  Participants participants = new Participants();
        participants.setId(1);
        List<Participants> participants1 =new ArrayList<>();
        participants1.add(participants);

        Activite activite = new Activite(titre,description,date_debut,date_fin,participants1,etat1);

        new ActiviteService().addActivite(activite);*/
      /*  activite.getDescription();
        activite.getDate_debut();
        activite.getTitre();
        activite.getTitre();
        activite.getDate_defin();
        activite.getParticipants();
        activite.getEtat();
        out.println(activite.toString());*/


        //}
    }
}





















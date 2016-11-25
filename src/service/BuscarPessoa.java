package service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import database.SelectPessoa;
import model.Pessoa;

public class BuscarPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuscarPessoa() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SelectPessoa pessoa = new SelectPessoa();
		ArrayList<Pessoa> listPessoa = pessoa.selectAllPessoa();
		
		String json = new Gson().toJson(listPessoa);
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    
	}
}
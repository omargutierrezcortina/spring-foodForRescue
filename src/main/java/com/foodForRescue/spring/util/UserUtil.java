package com.foodForRescue.spring.util;

import javax.servlet.http.HttpSession;

import com.foodForRescue.spring.model.Usuario;

public class UserUtil {
	

	public static boolean usuarioEnSesion(HttpSession session) {
		
		Usuario user = (Usuario) session.getAttribute("user");
		
		if(user !=null) {
			return true;
		}
		return false;
	}

}

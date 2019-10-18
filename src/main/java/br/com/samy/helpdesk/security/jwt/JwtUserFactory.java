package br.com.samy.helpdesk.security.jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.samy.helpdesk.entity.User;
import br.com.samy.helpdesk.enuns.ProfileEnum;

public class JwtUserFactory {
	
	private JwtUserFactory() {
	}
	
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(),
				user.getEmail(),
				user.getPassword(),
				mapToGranteAuthorities(user.getProfile()));
	}

	private static Collection<? extends GrantedAuthority> mapToGranteAuthorities(ProfileEnum profileEnum) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
		return authorities;
	}
	

}

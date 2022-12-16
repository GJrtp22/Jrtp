package com.phonebook.utils;
/*
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {
	
	private String secret="javaTechie";
	
	public String generateToken(String userName)
	{
		Map<String, Object> claims=new HashMap<>();
		return createToken(claims, userName);
		
	}

	private String createToken(Map<String, Object> claims, String userName) {
		
		return Jwts.builder().setClaims(claims).setSubject(userName).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS256, secret).compact();
	}
	
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String userName=extractUserName(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	private boolean isTokenExpired(String token) {
		
		return extractExpiration(token).before(new Date());
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}
	
	public <T> T  extractClaim(String token, Function<Claims, T> claimsResolver)
	{
		final Claims claims=extractAllclaims(token);
		return claimsResolver.apply(claims);
	}

	private Claims extractAllclaims(String token) {
		
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	public String extractUserName(String token) {
		// TODO Auto-generated method stub
		return extractClaim(token, Claims::getSubject);
	}

}
*/

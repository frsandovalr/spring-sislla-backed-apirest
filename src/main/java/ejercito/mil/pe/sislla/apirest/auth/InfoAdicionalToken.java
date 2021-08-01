package ejercito.mil.pe.sislla.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import ejercito.mil.pe.sislla.apirest.models.entity.Usuario;
import ejercito.mil.pe.sislla.apirest.models.service.IUsuarioServiceDos;

@Component
public class InfoAdicionalToken implements TokenEnhancer{

	
	@Autowired
	private IUsuarioServiceDos usuarioServiceDos;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = usuarioServiceDos.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<>();
		info.put("User",usuario.getGrado() +' '+ usuario.getArma()+' '+ usuario.getApellidosNombres());
		info.put("Img", usuario.getFoto());
		info.put("Id", usuario.getId());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}

package ejercito.mil.pe.sislla.apirest.auth;

public class JwtConfig {

	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpAIBAAKCAQEAriz9BSVZH4ZQUssTcaTDgD4badGQfMrhxdcWjlnEHhGChVBy\r\n"
			+ "mqv+ZUHSlJdByQnSsKDxfy9wxFQls2JGfdJxoMu3GFDiTn7+TqWNJGroKhnapv2h\r\n"
			+ "kBEPszkvd4+LqSQdC0xreRELC1uj9Z+6mVOUuCmwBeWHMMaNoJXnbcz4zCpiiteP\r\n"
			+ "ZBrHxGzqnxy10wcrYGQq1xpCbrofCLZvjZPqq5oSCtlK3Qog0STzovV4gE41iy8S\r\n"
			+ "RUEyuf3s5lHkWLAdkTj8ydS/vrpFeeWsxH22krMTH4oDCd0FyuHV7AyKjDO+Ta3+\r\n"
			+ "JdhpqbT6faAqZR58Nc66h1apmUmeoaoZ9mq0fQIDAQABAoIBAQCd581vl9+HtAYo\r\n"
			+ "OVGkauKO5j+GHOaoLGqpKQma/ojNVcSFxlxQG3PkKtuVuNd8QnqPhSnLy5+pbjxL\r\n"
			+ "t+H+egZn56hT1CiHT5yQgohGJuHaIVxYnoKVkNIyArsk4q+UJVhrgNnChZAEuQ0Z\r\n"
			+ "Rrkt/ldK6whZIDEDKE8H8j9BDV3WAWrndLMnZ9MPLTpprQOgr4vejzoAmEcIBZOS\r\n"
			+ "yYHVwv7HJzAOJeqlF7DI49qb6kfBeJW59Y677Bnzn/jFKNaguzHlzEhXUs2FxgHQ\r\n"
			+ "UHcWoCfs5Xu0r6/ndiFozNdSouBGq978/je2DI7fVM9swFXMrXVYqV5JnjQCTMvj\r\n"
			+ "DUrHLGQlAoGBAOV4+gyLMXGVz58ziggHtrVsHP1asVbaGQYA3+VEDm9Hvm0kqbWP\r\n"
			+ "7ACpTI3r50PcJAppiOEcVfOuRZlSlRtpTdsCIR+QX1hAM1vz8idXtFxFQcBTtgrD\r\n"
			+ "nceJder/YPMaQdSEoLX8DtCMIPXm7A9Gk38VMTsX+iSHkEKJkE2m099fAoGBAMJP\r\n"
			+ "jebBpiZCz/DIhskfAVnfxctZGEAg4fiQLD7lqg089Zt5ghzL0Bd5uGc7kthoENqq\r\n"
			+ "IS0Hsggq14hSxvebyIlhdZGTDF0ctqU/H8CYebeoiya+WmOtFzdU8W4auZCjq7e9\r\n"
			+ "nIih/5co7bnB6pHNPubZ3RpJ9KbzU8KmYHYLfWWjAoGBANXgktZ8KcJfSlts8xsW\r\n"
			+ "7XFc6gwtqppzvtz8lbIfY4DOkqsxf8gM83+OTB7/H9b86M6XnI+MFISCCraj5Pve\r\n"
			+ "g0U8T9kWe/dKJ1RuI2YN9boGhwkWPNb9iiJ/eVtlWVxcPb0xPIVCACDaaqIm8CAw\r\n"
			+ "vKq2+uLEL0461/dcNhZaBqHrAoGAGIOI12/e0jzjlvD1cDIlLX15qqnW0WBUodMu\r\n"
			+ "gdDfn0PtiGvP6mocGpoUlZGCeSLH3Y5RGSk7YKRnBJ/M0jgpGIvfFTqD+MtCj55j\r\n"
			+ "Fx0lXfI5e+3P4XtYznY87zMX7hN3+npFYUduw1c6hpDcUwCdyun5ZvOlldpk2s26\r\n"
			+ "panVbBkCgYAH8P00H3Je2mJ8mCij0lig26v4JNLtaMptjvdVUFasT2aYaQrfgD+S\r\n"
			+ "66aEqmAgAun09H9+WgfHInqwXE5ptjcpLQastJDdqDTw2Q33NhqBrGT6kmdXP44s\r\n"
			+ "VxgEXBDElKRXbuRQ78N0dgH5WKJcHg/+zjkyYaPu3PaWcFdEzYC0Wg==\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAriz9BSVZH4ZQUssTcaTD\r\n"
			+ "gD4badGQfMrhxdcWjlnEHhGChVBymqv+ZUHSlJdByQnSsKDxfy9wxFQls2JGfdJx\r\n"
			+ "oMu3GFDiTn7+TqWNJGroKhnapv2hkBEPszkvd4+LqSQdC0xreRELC1uj9Z+6mVOU\r\n"
			+ "uCmwBeWHMMaNoJXnbcz4zCpiitePZBrHxGzqnxy10wcrYGQq1xpCbrofCLZvjZPq\r\n"
			+ "q5oSCtlK3Qog0STzovV4gE41iy8SRUEyuf3s5lHkWLAdkTj8ydS/vrpFeeWsxH22\r\n"
			+ "krMTH4oDCd0FyuHV7AyKjDO+Ta3+JdhpqbT6faAqZR58Nc66h1apmUmeoaoZ9mq0\r\n"
			+ "fQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
			
			
}

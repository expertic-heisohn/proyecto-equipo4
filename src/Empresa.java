
public class Empresa {
	
	//Atributes
	
	private int Id;
	private int TipoDocumento;
	private int Documento;
	private int NroVerificacion;
	private String Nombre;
	private String ActividadEconomica;
	private String Email;
	private String Telefono;
	private int Departamento;
	private int Provincia;
	private String Direccion;
	
	//Constructors
	
	public Empresa()
	{
		
	}
	
	public Empresa(int Id, int TipoDocumento, int Documento, int NroVerificacion, String Nombre,
			String ActividadEconomica, String Email, String Telefono, int Departamento, int Provincia,
			String Direccion)
	{
		this.Id = Id;
		this.TipoDocumento = TipoDocumento;
		this.Documento = Documento;
		this.NroVerificacion = NroVerificacion;
		this.Nombre = Nombre;
		this.ActividadEconomica = ActividadEconomica;
		this.Email = Email;
		this.Telefono = Telefono;
		this.Departamento = Departamento;
		this.Provincia = Provincia;
		this.Direccion = Direccion;
	}
	
	//Properties
	
	public void setId(int Id)
	{
		this.Id = Id;
	}
	
	public int getTipoDocumento()
	{
		return TipoDocumento;
	}
	
	public void setTipoDocumento(int TipoDocumento)
	{
		this.TipoDocumento = TipoDocumento;
	}
	
	public int getDocumento()
	{
		return Documento;
	}
	
	public void setDocumento(int Documento) 
	{
		this.Documento = Documento;
	}
	
	public int getNroVerificacion() 
	{
		return NroVerificacion;
	}
	
	public void setNroVerificacion(int NroVerificacion)
	{
		this.NroVerificacion = NroVerificacion;
	}
	
	public String getNombre()
	{
		return Nombre;
	}
	
	public void setNombre(String Nombre)
	{
		this.Nombre = Nombre;
	}
	
	public String getActividadEconomica() 
	{
		return ActividadEconomica;
	}
	
	public void setActividadEconomica(String ActividadEconomica)
	{
		this.ActividadEconomica = ActividadEconomica;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getTelefono()
	{
		return Telefono;
	}
	
	public void setTelefono(String Telefono)
	{
		this.Telefono = Telefono;
	}
	
	public int getDepartamento()
	{
		return Departamento;
	}
	
	public void setDepartamento(int Departamento)
	{
		this.Departamento = Departamento;
	}
	
	public int getProvincia()
	{
		return Provincia;
	}
	
	public void setProvincia(int Provincia)
	{
		this.Provincia = Provincia;
	}

	public String getDireccion()
	{
		return Direccion;
	}
	
	public void setDireccion(String Direccion)
	{
		this.Direccion = Direccion;
	}
}

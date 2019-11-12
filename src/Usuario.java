
public class Usuario {
	
	//Atributes
	
	private int Id;
	private int TipoDocumento;
	private int Documento;
	private String Nombre;
	private String Apellidos;
	private String FechaNacimiento; //No se si guardarlo como Date
	private int Genero;
	private int EstadoCivil;
	private String Telefono;
	private String Celular;
	private String Email;
	private int Departamento;
	private int Provincia;
	private String Direccion;
	//No se va a incluir ARL, EPS y otras dado que es para Bolivia
	private String EntidadEmpleadora;
	private String Cargo;
	private int TipoContrato; //Analizar con el equipo ya que es para Bolivia
	
	//Constructors
	
	public Usuario() {
		
	}
	
	public Usuario(int Id, int TipoDocumento, int Documento, String Nombre, String Apellidos, 
			String FechaNacimiento, int Genero, int EstadoCivil, String Telefono, String Celular,
			String Email, int Departamento, int Provincia, String Direccion, String EntidadEmpleadora,
			String Cargo, int TipoContrato) 
	{
		this.Id = Id;
		this.TipoDocumento = TipoDocumento;
		this.Documento = Documento;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.FechaNacimiento = FechaNacimiento;
		this.Genero = Genero;
		this.EstadoCivil = EstadoCivil;
		this.Telefono = Telefono;
		this.Celular = Celular;
		this.Email = Email;
		this.Departamento = Departamento;
		this.Provincia = Provincia;
		this.Direccion = Direccion;
		this.EntidadEmpleadora = EntidadEmpleadora;
		this.Cargo = Cargo;
		this.TipoContrato = TipoContrato;
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
	
	public void setTipoDocumento(int TipoDoc) 
	{
		this.TipoDocumento = TipoDoc;
	}
	
	public int getDocumento()
	{
		return Documento;
	}
	
	public void setDocumento(int Doc) 
	{
		this.Documento = Doc;
	}
	
	public String getNombre()
	{
		return Nombre;
	}
	
	public void setNombre(String Nombre) 
	{
		this.Nombre = Nombre;
	}
	
	public String getApellidos()
	{
		return Apellidos;
	}
	
	public void setApellidos(String Apellidos)
	{
		this.Apellidos = Apellidos;
	}
	
	public String getFechaNacimiento() 
	{
		return FechaNacimiento;
	}
	
	public void setFechaNacimiento(String FechaNacimiento)
	{
		this.FechaNacimiento = FechaNacimiento;
	}
	
	public int getGenero() 
	{
		return Genero;
	}
	
	public void setGenero(int Genero) 
	{
		this.Genero = Genero;		
	}

	public int getEstadoCivil() 
	{
		return EstadoCivil;
	}
	
	public void setEstadoCivil(int EstadoCivil)
	{
		this.EstadoCivil = EstadoCivil;
	}
	
	public String getTelefono()
	{
		return Telefono;
	}
	
	public void setTelefono(String Telefono) 
	{
		this.Telefono = Telefono;
	}
	
	public String getCelular() 
	{
		return Celular;
	}
	
	public void setCelular(String Celular)
	{
		this.Celular = Celular;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
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
	
	public String getEntidadEmpleadora()
	{
		return EntidadEmpleadora;
	}
	
	public void setEntidadEmpleadora(String EntidadEmpleadora) 
	{
		this.EntidadEmpleadora = EntidadEmpleadora;
	}
	
	public String getCargo()
	{
		return Cargo;
	}
	
	public void setCargo(String Cargo)
	{
		this.Cargo = Cargo;
	}
	
	public int getTipoContrato()
	{
		return TipoContrato;
	}
	
	public void setTipoContrato(int TipoContrato) 
	{
		this.TipoContrato = TipoContrato;
	}
}

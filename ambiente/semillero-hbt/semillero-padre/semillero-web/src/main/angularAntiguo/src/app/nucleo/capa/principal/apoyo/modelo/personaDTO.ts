export interface PersonaDTO { 
	id: string;
	nombre: string;
	apellido: string;
	tipoIdentificacion: string;
	numeroIdentificacion: number | string;
	mayorEdad:boolean;
	sexo:string;
	fechaNacimiento: string; //mientras tanto lo dejare como string
}

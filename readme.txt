Creacion de schema y tablas

Create schema crud_java;
use crud_java;

Create table cursos (
	id_curso int auto_increment primary key,
    nombre_curso varchar(100),
    descripcion_curso varchar(100),
    fecha_inicio date,
    fecha_fin date,
    activo boolean
);

Create table docentes (
	id_docente int auto_increment primary key,
    nombre_docente varchar(30),
    apellido_docente varchar(30),
    curso_imparte int,
    foreign key (curso_imparte) references cursos(id_curso)
);
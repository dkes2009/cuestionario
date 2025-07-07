package com.crud.cuestionario.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "RequiQuestions")
public class RequiQuestions {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nombre")
        private String nombre;

        @Column(name = "eslogan")
        private String eslogan;

        @Column(name = "objetivo")
        private String objetivo;

        @Column(name = "url")
        private String url;

        @Column(name = "publico")
        private String publico;

        @Column(name = "secciones")
        private String secciones;

        @Column(name = "contenido")
        private String contenido;

        @Column(name = "contacto")
        private String contacto;

        @Column(name = "referencia")
        private String referencia;

        @Column(name = "branding")
        private String branding;

        @Column(name = "responsivo")
        private String responsivo;

        @Column(name = "animaciones")
        private String animaciones;

        @Column(name = "redes")
        private String redes;

        @Column(name = "hosting")
        private String hosting;

        @Column(name = "mantenimiento")
        private String mantenimiento;

        @Column(name = "fecha_limite")
        private String fecha_limite;


        @Column(name = "presupuesto")
        private String presupuesto;

        public RequiQuestions() {
        }

        @Override
        public String toString() {
                return "RequiQuestions{" +
                        "id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", eslogan='" + eslogan + '\'' +
                        ", objetivo='" + objetivo + '\'' +
                        ", url='" + url + '\'' +
                        ", publico='" + publico + '\'' +
                        ", secciones='" + secciones + '\'' +
                        ", contenido='" + contenido + '\'' +
                        ", contacto='" + contacto + '\'' +
                        ", referencia='" + referencia + '\'' +
                        ", branding='" + branding + '\'' +
                        ", responsivo='" + responsivo + '\'' +
                        ", animaciones='" + animaciones + '\'' +
                        ", redes='" + redes + '\'' +
                        ", hosting='" + hosting + '\'' +
                        ", mantenimiento='" + mantenimiento + '\'' +
                        ", fecha_limite='" + fecha_limite + '\'' +
                        ", presupuesto='" + presupuesto + '\'' +
                        '}';
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getEslogan() {
                return eslogan;
        }

        public void setEslogan(String eslogan) {
                this.eslogan = eslogan;
        }

        public String getObjetivo() {
                return objetivo;
        }

        public void setObjetivo(String objetivo) {
                this.objetivo = objetivo;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public String getPublico() {
                return publico;
        }

        public void setPublico(String publico) {
                this.publico = publico;
        }

        public String getSecciones() {
                return secciones;
        }

        public void setSecciones(String secciones) {
                this.secciones = secciones;
        }

        public String getContenido() {
                return contenido;
        }

        public void setContenido(String contenido) {
                this.contenido = contenido;
        }

        public String getContacto() {
                return contacto;
        }

        public void setContacto(String contacto) {
                this.contacto = contacto;
        }

        public String getReferencia() {
                return referencia;
        }

        public void setReferencia(String referencia) {
                this.referencia = referencia;
        }

        public String getBranding() {
                return branding;
        }

        public void setBranding(String branding) {
                this.branding = branding;
        }

        public String getResponsivo() {
                return responsivo;
        }

        public void setResponsivo(String responsivo) {
                this.responsivo = responsivo;
        }

        public String getAnimaciones() {
                return animaciones;
        }

        public void setAnimaciones(String animaciones) {
                this.animaciones = animaciones;
        }

        public String getRedes() {
                return redes;
        }

        public void setRedes(String redes) {
                this.redes = redes;
        }

        public String getHosting() {
                return hosting;
        }

        public void setHosting(String hosting) {
                this.hosting = hosting;
        }

        public String getMantenimiento() {
                return mantenimiento;
        }

        public void setMantenimiento(String mantenimiento) {
                this.mantenimiento = mantenimiento;
        }

        public String getFecha_limite() {
                return fecha_limite;
        }

        public void setFecha_limite(String fecha_limite) {
                this.fecha_limite = fecha_limite;
        }

        public String getPresupuesto() {
                return presupuesto;
        }

        public void setPresupuesto(String presupuesto) {
                this.presupuesto = presupuesto;
        }
}


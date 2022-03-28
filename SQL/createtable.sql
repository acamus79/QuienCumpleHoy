-- Table: public.cumple

-- DROP TABLE IF EXISTS public.cumple;

CREATE TABLE IF NOT EXISTS public.cumple
(
    id integer NOT NULL,
    sexo character(1) COLLATE pg_catalog."default" NOT NULL,
    nombres character varying(255) COLLATE pg_catalog."default",
    apellidos character varying(255) COLLATE pg_catalog."default",
    dia integer,
    mes integer,
    anio integer,
    email character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT cumple_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cumple
    OWNER to iwshtpuhryihkp;
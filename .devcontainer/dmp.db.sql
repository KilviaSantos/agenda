SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE IF EXISTS agenda;

CREATE DATABASE agenda WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C.UTF-8' LC_CTYPE = 'C.UTF-8';

ALTER DATABASE agenda OWNER TO postgres;

\connect agenda


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: contatos; Type: TABLE; Owner: postgres
--

CREATE TABLE contatos (
    id integer NOT NULL,
    nome character varying(200),
    email character varying(100),
    endereco character varying(200),
    telefone character(20)
);

ALTER TABLE contatos OWNER TO postgres;

--
-- Name: contatos_id_seq; Type: SEQUENCE;  Owner: postgres
--

CREATE SEQUENCE contatos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE contatos_id_seq OWNER TO postgres;

--
-- Name: contatos_id_seq; Type: SEQUENCE OWNED BY; Owner: postgres
--

ALTER SEQUENCE contatos_id_seq OWNED BY contatos.id;

ALTER TABLE ONLY contatos ALTER COLUMN id SET DEFAULT nextval('contatos_id_seq'::regclass);

INSERT INTO contatos ('id', 'nome', 'email', 'endereco', 'telefone') VALUES (1, 'ABC Company', 'abc@example.com', 'Main Street	São Paulo	Centro', '1234567890')
INSERT INTO contatos ('id', 'nome', 'email', 'endereco', 'telefone') VALUES (2, 'XYZ Corporation', 'xyz@example.com', 'Elm Street	Rio de Janeiro', '0987654321')
INSERT INTO contatos ('id', 'nome', 'email', 'endereco', 'telefone') VALUES (3, 'PQR Industries', 'pqr@example.com', 'Oak Avenue	Belo Horizonte	Savassi', '5678901234')
INSERT INTO contatos ('id', 'nome', 'email', 'endereco', 'telefone') VALUES (4, 'LMN Solutions', 'lmn@example.com', 'Maple Lane	Curitiba	Batel	9012345678', '9012345678')
INSERT INTO contatos ('id', 'nome', 'email', 'endereco', 'telefone') VALUES (5, 'DEF Corporation', 'def@example.com', 'Pine Road	Porto Alegre	Moinhos', '3456789012')


ALTER TABLE ONLY contatos
    ADD CONSTRAINT contatos_pkey PRIMARY KEY (id);

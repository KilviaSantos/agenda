--
-- PostgreSQL database dump
--

-- Dumped from database version 16.0 (Debian 16.0-1.pgdg110+1)
-- Dumped by pg_dump version 16.0 (Debian 16.0-1.pgdg110+1)

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: contatos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contatos (
    id integer NOT NULL,
    created_at timestamp(6) without time zone,
    email character varying(255),
    endereco character varying(255),
    nome character varying(255),
    telefone character varying(255),
    updated_at timestamp(6) without time zone
);


ALTER TABLE public.contatos OWNER TO postgres;

--
-- Name: contatos_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contatos_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.contatos_seq OWNER TO postgres;

--
-- Data for Name: contatos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.contatos (id, created_at, email, endereco, nome, telefone, updated_at) FROM stdin;
1	2023-10-01 19:09:04.633344	kilvia@mail.com	rua rubens monte, 120	kilvia santos 	85 999119855	2023-10-01 19:09:04.633597
2	2023-10-01 19:12:20.90778	neidimar@mail.com	rua dos prazeres	neidimar 	85 91111111	2023-10-01 19:12:20.908008
3	2023-10-01 19:13:59.634898	sarah@mail.com	rua rubens monte, 120	sarah santos	85999119855	2023-10-01 19:13:59.63505
4	2023-10-01 19:15:46.546094	sophia@mail.com	rua rubens monte, 120 	sophia santos 	85999119855	2023-10-01 19:15:46.546243
\.


--
-- Name: contatos_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contatos_seq', 301, true);


--
-- Name: contatos contatos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contatos
    ADD CONSTRAINT contatos_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--


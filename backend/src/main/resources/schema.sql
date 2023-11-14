--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1
-- Dumped by pg_dump version 16.1

-- Started on 2023-11-14 19:45:52

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

--
-- TOC entry 4898 (class 1262 OID 16397)
-- Name: cassino; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE cassino WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE cassino OWNER TO postgres;

\connect cassino

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

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: pg_database_owner
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO pg_database_owner;

--
-- TOC entry 4899 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 851 (class 1247 OID 16487)
-- Name: tipo_carta; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.tipo_carta AS ENUM (
    'GANHOU',
    'PERDEU'
);


ALTER TYPE public.tipo_carta OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 18768)
-- Name: carta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.carta (
    tipo boolean,
    valor double precision,
    id bigint NOT NULL
);


ALTER TABLE public.carta OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 18767)
-- Name: carta_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.carta_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.carta_id_seq OWNER TO postgres;

--
-- TOC entry 4900 (class 0 OID 0)
-- Dependencies: 215
-- Name: carta_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.carta_id_seq OWNED BY public.carta.id;


--
-- TOC entry 218 (class 1259 OID 18775)
-- Name: compra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.compra (
    quantidade_de_fichas integer NOT NULL,
    id bigint NOT NULL,
    id_conta_id bigint,
    id_ficha_id bigint
);


ALTER TABLE public.compra OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 18774)
-- Name: compra_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.compra_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.compra_id_seq OWNER TO postgres;

--
-- TOC entry 4901 (class 0 OID 0)
-- Dependencies: 217
-- Name: compra_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.compra_id_seq OWNED BY public.compra.id;


--
-- TOC entry 220 (class 1259 OID 18782)
-- Name: conta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.conta (
    quantidade_de_fichas integer,
    saldo_de_ganho double precision,
    saldo_de_perda double precision,
    id bigint NOT NULL
);


ALTER TABLE public.conta OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 18781)
-- Name: conta_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.conta_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.conta_id_seq OWNER TO postgres;

--
-- TOC entry 4902 (class 0 OID 0)
-- Dependencies: 219
-- Name: conta_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.conta_id_seq OWNED BY public.conta.id;


--
-- TOC entry 222 (class 1259 OID 18789)
-- Name: ficha; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ficha (
    valor double precision,
    id bigint NOT NULL
);


ALTER TABLE public.ficha OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 18788)
-- Name: ficha_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ficha_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.ficha_id_seq OWNER TO postgres;

--
-- TOC entry 4903 (class 0 OID 0)
-- Dependencies: 221
-- Name: ficha_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ficha_id_seq OWNED BY public.ficha.id;


--
-- TOC entry 224 (class 1259 OID 18796)
-- Name: jogo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jogo (
    carta_id bigint,
    id bigint NOT NULL,
    usuario_id bigint
);


ALTER TABLE public.jogo OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 18795)
-- Name: jogo_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.jogo_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.jogo_id_seq OWNER TO postgres;

--
-- TOC entry 4904 (class 0 OID 0)
-- Dependencies: 223
-- Name: jogo_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.jogo_id_seq OWNED BY public.jogo.id;


--
-- TOC entry 226 (class 1259 OID 18803)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id bigint NOT NULL,
    nome character varying(255)
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 18802)
-- Name: usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuario_id_seq OWNER TO postgres;

--
-- TOC entry 4905 (class 0 OID 0)
-- Dependencies: 225
-- Name: usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_id_seq OWNED BY public.usuario.id;


--
-- TOC entry 4716 (class 2604 OID 18771)
-- Name: carta id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carta ALTER COLUMN id SET DEFAULT nextval('public.carta_id_seq'::regclass);


--
-- TOC entry 4717 (class 2604 OID 18778)
-- Name: compra id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra ALTER COLUMN id SET DEFAULT nextval('public.compra_id_seq'::regclass);


--
-- TOC entry 4718 (class 2604 OID 18785)
-- Name: conta id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conta ALTER COLUMN id SET DEFAULT nextval('public.conta_id_seq'::regclass);


--
-- TOC entry 4719 (class 2604 OID 18792)
-- Name: ficha id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ficha ALTER COLUMN id SET DEFAULT nextval('public.ficha_id_seq'::regclass);


--
-- TOC entry 4720 (class 2604 OID 18799)
-- Name: jogo id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jogo ALTER COLUMN id SET DEFAULT nextval('public.jogo_id_seq'::regclass);


--
-- TOC entry 4721 (class 2604 OID 18806)
-- Name: usuario id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN id SET DEFAULT nextval('public.usuario_id_seq'::regclass);


--
-- TOC entry 4882 (class 0 OID 18768)
-- Dependencies: 216
-- Data for Name: carta; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.carta VALUES (false, 20, 1);
INSERT INTO public.carta VALUES (true, 100, 2);
INSERT INTO public.carta VALUES (false, 40, 3);


--
-- TOC entry 4884 (class 0 OID 18775)
-- Dependencies: 218
-- Data for Name: compra; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4886 (class 0 OID 18782)
-- Dependencies: 220
-- Data for Name: conta; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4888 (class 0 OID 18789)
-- Dependencies: 222
-- Data for Name: ficha; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4890 (class 0 OID 18796)
-- Dependencies: 224
-- Data for Name: jogo; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4892 (class 0 OID 18803)
-- Dependencies: 226
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4906 (class 0 OID 0)
-- Dependencies: 215
-- Name: carta_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.carta_id_seq', 3, true);


--
-- TOC entry 4907 (class 0 OID 0)
-- Dependencies: 217
-- Name: compra_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.compra_id_seq', 1, false);


--
-- TOC entry 4908 (class 0 OID 0)
-- Dependencies: 219
-- Name: conta_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.conta_id_seq', 19, true);


--
-- TOC entry 4909 (class 0 OID 0)
-- Dependencies: 221
-- Name: ficha_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ficha_id_seq', 1, false);


--
-- TOC entry 4910 (class 0 OID 0)
-- Dependencies: 223
-- Name: jogo_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.jogo_id_seq', 19, true);


--
-- TOC entry 4911 (class 0 OID 0)
-- Dependencies: 225
-- Name: usuario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_id_seq', 19, true);


--
-- TOC entry 4723 (class 2606 OID 18773)
-- Name: carta carta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carta
    ADD CONSTRAINT carta_pkey PRIMARY KEY (id);


--
-- TOC entry 4725 (class 2606 OID 18780)
-- Name: compra compra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_pkey PRIMARY KEY (id);


--
-- TOC entry 4727 (class 2606 OID 18787)
-- Name: conta conta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conta
    ADD CONSTRAINT conta_pkey PRIMARY KEY (id);


--
-- TOC entry 4729 (class 2606 OID 18794)
-- Name: ficha ficha_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ficha
    ADD CONSTRAINT ficha_pkey PRIMARY KEY (id);


--
-- TOC entry 4731 (class 2606 OID 18801)
-- Name: jogo jogo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT jogo_pkey PRIMARY KEY (id);


--
-- TOC entry 4733 (class 2606 OID 18808)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);


--
-- TOC entry 4736 (class 2606 OID 18819)
-- Name: jogo fk9j11imcqsi2j6axfyatv8cny4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT fk9j11imcqsi2j6axfyatv8cny4 FOREIGN KEY (carta_id) REFERENCES public.carta(id);


--
-- TOC entry 4734 (class 2606 OID 18814)
-- Name: compra fkaafn7qj9mkuabbtfftucd7da3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra
    ADD CONSTRAINT fkaafn7qj9mkuabbtfftucd7da3 FOREIGN KEY (id_ficha_id) REFERENCES public.ficha(id);


--
-- TOC entry 4737 (class 2606 OID 18824)
-- Name: jogo fkkv8binh44mbckalfwrh8qumgq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT fkkv8binh44mbckalfwrh8qumgq FOREIGN KEY (usuario_id) REFERENCES public.usuario(id);


--
-- TOC entry 4735 (class 2606 OID 18809)
-- Name: compra fkphc2jidofvrd73m2wpr21ul5y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra
    ADD CONSTRAINT fkphc2jidofvrd73m2wpr21ul5y FOREIGN KEY (id_conta_id) REFERENCES public.conta(id);


-- Completed on 2023-11-14 19:45:53

--
-- PostgreSQL database dump complete
--


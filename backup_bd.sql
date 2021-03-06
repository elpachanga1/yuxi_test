toc.dat                                                                                             0000600 0004000 0002000 00000005166 14244305777 0014464 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP           *                z         	   yuxi_test    14.3    14.3     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false         ?           1262    16394 	   yuxi_test    DATABASE     m   CREATE DATABASE yuxi_test WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE yuxi_test;
                postgres    false         ?            1259    16406    searches    TABLE     ?   CREATE TABLE public.searches (
    id integer NOT NULL,
    user_id integer NOT NULL,
    search_date timestamp without time zone,
    page integer,
    size integer
);
    DROP TABLE public.searches;
       public         heap    postgres    false         ?            1259    16405    search_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.search_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.search_id_seq;
       public          postgres    false    210         ?           0    0    search_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.search_id_seq OWNED BY public.searches.id;
          public          postgres    false    209         \           2604    16409    searches id    DEFAULT     h   ALTER TABLE ONLY public.searches ALTER COLUMN id SET DEFAULT nextval('public.search_id_seq'::regclass);
 :   ALTER TABLE public.searches ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    209    210    210         ?          0    16406    searches 
   TABLE DATA           H   COPY public.searches (id, user_id, search_date, page, size) FROM stdin;
    public          postgres    false    210       3307.dat ?           0    0    search_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.search_id_seq', 11, true);
          public          postgres    false    209         ^           2606    16411    searches yuxi_search 
   CONSTRAINT     R   ALTER TABLE ONLY public.searches
    ADD CONSTRAINT yuxi_search PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.searches DROP CONSTRAINT yuxi_search;
       public            postgres    false    210                                                                                                                                                                                                                                                                                                                                                                                                                  3307.dat                                                                                            0000600 0004000 0002000 00000000327 14244305777 0014265 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        5	1	2018-12-10 08:45:00	0	50
6	1	2018-12-10 08:45:00	0	50
7	1	2018-12-10 08:45:00	0	50
8	1	2018-12-10 08:45:00	0	50
9	1	2018-12-10 08:45:00	0	50
10	1	2018-12-10 08:45:00	0	50
11	10	2022-05-27 21:36:50.621	0	25
\.


                                                                                                                                                                                                                                                                                                         restore.sql                                                                                         0000600 0004000 0002000 00000005343 14244305777 0015406 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 14.3
-- Dumped by pg_dump version 14.3

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

DROP DATABASE yuxi_test;
--
-- Name: yuxi_test; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE yuxi_test WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';


ALTER DATABASE yuxi_test OWNER TO postgres;

\connect yuxi_test

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
-- Name: searches; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.searches (
    id integer NOT NULL,
    user_id integer NOT NULL,
    search_date timestamp without time zone,
    page integer,
    size integer
);


ALTER TABLE public.searches OWNER TO postgres;

--
-- Name: search_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.search_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.search_id_seq OWNER TO postgres;

--
-- Name: search_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.search_id_seq OWNED BY public.searches.id;


--
-- Name: searches id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.searches ALTER COLUMN id SET DEFAULT nextval('public.search_id_seq'::regclass);


--
-- Data for Name: searches; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.searches (id, user_id, search_date, page, size) FROM stdin;
\.
COPY public.searches (id, user_id, search_date, page, size) FROM '$$PATH$$/3307.dat';

--
-- Name: search_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.search_id_seq', 11, true);


--
-- Name: searches yuxi_search; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.searches
    ADD CONSTRAINT yuxi_search PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
USE [testdb]
GO

/****** Object:  Table [dbo].[juristic_search]    Script Date: 24/6/2563 22:21:41 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[juristic_search](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[juristic_id] [varchar](50) NULL,
	[juristic_name_en] [varchar](50) NULL,
	[juristic_name_th] [varchar](50) NULL,
	[juristic_type] [varchar](50) NULL,
	[juristic_nationality] [varchar](50) NULL,
	[juristic_business_type] [varchar](50) NULL
) ON [PRIMARY]
GO
import React from 'react'

interface HeaderProps{
    title: string
}

export default function Header(props : HeaderProps) {
  return (
    <div>
        <h1>{props.title}</h1>
    </div>
  )
}

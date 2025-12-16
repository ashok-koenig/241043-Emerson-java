import { useState } from "react"

interface UserCounterReturn{
    count: number
    increment: () => void
}

function useCounter(initialValue: number = 0): UserCounterReturn {
    const [count, setCount] = useState(initialValue)

    const increment = () => {
        setCount(count + 1)
    }

    return {count, increment}
}

export default useCounter